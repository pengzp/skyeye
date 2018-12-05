package com.skyeye.planproject.dao;

import java.util.List;
import java.util.Map;

public interface PlanProjectFlowDao {

	public List<Map<String, Object>> queryPlanProjectFlowList(Map<String, Object> map) throws Exception;

	public int insertPlanProjectFlowMation(Map<String, Object> map) throws Exception;

	public Map<String, Object> queryPlanProjectFlowMationByName(Map<String, Object> map) throws Exception;

	public int deletePlanProjectFlowMationById(Map<String, Object> map) throws Exception;

	public Map<String, Object> queryPlanProjectFlowMationToEditById(Map<String, Object> map) throws Exception;

	public Map<String, Object> queryPlanProjectFlowMationByNameAndId(Map<String, Object> map) throws Exception;

	public int editPlanProjectFlowMationById(Map<String, Object> map) throws Exception;

}
