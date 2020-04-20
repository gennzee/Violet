package com.xa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

@Component
public class FileUploaderService {

    private static final String folderToProcess = "WEB-INF/static/fileStorage/images";

    private String imageName = "";

    public FileUploaderService(){}

    @Autowired
    private RandomStringService randomStringService;

    public void uploadFile(HttpServletRequest request, MultipartFile file){
        try{
            String uploadRootPath = request.getServletContext().getRealPath(folderToProcess);
            System.out.println("uploadRootPath = " + uploadRootPath);
            File uploadRootDir = new File(uploadRootPath);
            if(!uploadRootDir.exists()){
                uploadRootDir.mkdirs();
            }
            String clientFileName = file.getOriginalFilename();
            int clientFileNameSize = clientFileName.length();
            String imageFormat = clientFileName.substring(clientFileNameSize - 5, clientFileNameSize);
            imageName = randomStringService.generateRandomString(45) + imageFormat.substring(imageFormat.indexOf("."));
            System.out.println("Client file name = " + clientFileName);
            System.out.println("Client file name size = " + clientFileNameSize);
            System.out.println("Client file name format = " + imageFormat);
            System.out.println("Server Image name = " + imageName);
            File serverFile = new File(uploadRootDir.getAbsolutePath() + File.separator + imageName);
            BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(serverFile));
            stream.write(file.getBytes());
            stream.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void deleteFile(HttpServletRequest request, String file){
        try{
            if(!(file == null || file.isEmpty())){
                String uploadRootPath = request.getServletContext().getRealPath(folderToProcess);
                File[] listImage = new File(uploadRootPath).listFiles();
                if(listImage != null && listImage.length != 0){
                    for(int i = 0; i<listImage.length;i++){
                        if(listImage[i].getName().contains(file)){
                            Files.delete(Paths.get(uploadRootPath+"/"+listImage[i].getName()));
                        }
                    }
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}
