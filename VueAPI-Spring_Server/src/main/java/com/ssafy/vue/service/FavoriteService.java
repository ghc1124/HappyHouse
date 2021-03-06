package com.ssafy.vue.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ssafy.vue.dto.Favorite;
import com.ssafy.vue.dto.HouseInfoDto;
import com.ssafy.vue.dto.FavoriteAptDto;

public interface FavoriteService {
	public List<FavoriteAptDto> listFavorite(String userid) throws Exception;
	public boolean addFavorite(Favorite favorite) throws Exception;
	public boolean deleteFavorite(Favorite favorite) throws Exception;
	public List<HouseInfoDto> listDealInfo(String aptCode);
}
