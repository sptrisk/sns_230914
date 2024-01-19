package com.sns.timeline.bo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sns.post.entity.PostEntity;
import com.sns.timeline.domain.CardView;

@Service
public class TimelineBO {
	
	
	
	// input : X    output : List<CardView>
	public List<CardView> generateCardViewList() {
		List<CardView> cardViewList = new ArrayList<>();
		
		// 글 목록을 가져온다. List<PostEntity>
		List<PostEntity> postList = new ArrayList<>();
		
		// 글 목록 반복문 순회
		// post => cardView   => cardViewList에 넣기
		
		for (int i = 0; i < postList.size(); i ++) {
			cardViewList = 
		}
		
		
		
		return cardViewList;
	}
	
}
