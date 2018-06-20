package com.migu.schedule;


import com.migu.schedule.constants.ReturnCodeKeys;
import com.migu.schedule.info.TaskInfo;

import java.util.List;

/*
*类名和方法不能修改
 */
public class Schedule {

	// 
    public static final String zkhosts = "192.168.2.118:2181";  
    //   
    public static final int sessionTimeout = 2000;  
    // 
    public static final String parentZnodePath = "/servers"; 
    
    
    public int init() {
        
        return ReturnCodeKeys.E001;
    }


    public int registerNode(int nodeId) {
    	TaskInfo taskInfo =new TaskInfo();
    	if(nodeId<0){
    		return ReturnCodeKeys.E004;
    	}else {
    		taskInfo.setNodeId(nodeId);
    	}
    	
        return ReturnCodeKeys.E003;
    }

    public int unregisterNode(int nodeId) {
       
    	if(nodeId<0){
    		return ReturnCodeKeys.E004;
    	}else{
    		
    	}
        return ReturnCodeKeys.E006;
    }


    public int addTask(int taskId, int consumption) {
    	TaskInfo taskInfo =new TaskInfo();
    	if(nodeId<0){
    		return ReturnCodeKeys.E009;
    	}
    	taskInfo.setTaskId(taskId);
        return ReturnCodeKeys.E008;
    }


    public int deleteTask(int taskId) {
    	if(nodeId<0){
    		return ReturnCodeKeys.E009;
    	}
        return ReturnCodeKeys.E011;
    }


    public int scheduleTask(int threshold) {
        if(threshold<0){
        	return ReturnCodeKeys.E002;
        }
        return ReturnCodeKeys.E013;
    }


    public int queryTaskStatus(List<TaskInfo> tasks) {
        if(tasks=null){
        	return ReturnCodeKeys.E016;
        }
        for(TaskInfo a:tasks){
        	a.toString();
        }
        return ReturnCodeKeys.E015;
    }

}
