package com.xa.controller.controllerService;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by anhnx on 23/07/2020.
 */
public interface FavoriteService {

    boolean addToFavoriteUsingAjax(int productId, Map<String, String> m, HttpSession session);

    boolean removeFavoriteUsingAjax(int productId, HttpSession session);

}
