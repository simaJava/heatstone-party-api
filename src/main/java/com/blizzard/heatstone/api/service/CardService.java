package com.blizzard.heatstone.api.service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.blizzard.heatstone.api.enums.ApiStatus;
import com.blizzard.heatstone.api.swagger.model.Card;
import com.blizzard.heatstone.dao.CardDao;

@Service("com.blizzard.heatstone.api.swagger.api.CardsApiController")
public class CardService {

	private static Logger log = LoggerFactory.getLogger(CardService.class);
	
	@Autowired
	private CardDao cardDao;
	
	public ResponseEntity<Map<String, Object>> insert(Card card) {
		log.info("insert card : " + card);
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			card.setCreateTime(null);
			int id = cardDao.insertSelective(card);
			if(id > 1){
				card.setId(id);
				map.put("status", ApiStatus.SUCCESS.getCode());
				map.put("msg", ApiStatus.SUCCESS.getMessage());
				map.put("card", card);
			}else{
				log.warn("insert card with wrong id: " + id);
				map.put("status", ApiStatus.FAIL.getCode());
				map.put("msg", ApiStatus.FAIL.getMessage());
			}
		} catch (Exception e) {
			log.error("insert card:" + card + " error", e);
			map.put("status", ApiStatus.ERROR.getCode());
			map.put("msg", ApiStatus.ERROR.getMessage());
		}
		ResponseEntity<Map<String, Object>> responseEntity = new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
        return responseEntity;
	}
}
