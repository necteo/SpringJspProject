package com.sist.web.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sist.web.mapper.RecipeMapper;
import com.sist.web.vo.RecipeVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RecipeServiceImpl implements RecipeService {
	
	private final RecipeMapper mapper;

	@Override
	public List<RecipeVO> recipeListData(int start) {
		return mapper.recipeListData(start);
	}

	@Override
	public int recipeTotalPage() {
		return mapper.recipeTotalPage();
	}

}
