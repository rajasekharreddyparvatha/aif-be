package com.tfc.ilabs.aif.Feature.model;

import java.util.List;

/**
 * Created by rajasekhar on 19-Dec-18.
 */
public class FeatureDTO {

    private String label;

    private String url;

    private String featureId;

    private List<ParamDTO> params;

    private  List<String> keywords;

    private  List<ActionDTO> actions;

    private  List<ActionsExecutionFlowDTO> actionsExecutionFlow;

    public FeatureDTO() {
    }

    public FeatureDTO(String label, String url, String featureId, List<ParamDTO> params, List<String> keywords, List<ActionDTO> actions, List<ActionsExecutionFlowDTO> actionsExecutionFlow) {
        this.label = label;
        this.url = url;
        this.featureId = featureId;
        this.params = params;
        this.keywords = keywords;
        this.actions = actions;
        this.actionsExecutionFlow = actionsExecutionFlow;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFeatureId() {
        return featureId;
    }

    public void setFeatureId(String featureId) {
        this.featureId = featureId;
    }

    public List<ParamDTO> getParams() {
        return params;
    }

    public void setParams(List<ParamDTO> params) {
        this.params = params;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public List<ActionDTO> getActions() {
        return actions;
    }

    public void setActions(List<ActionDTO> actions) {
        this.actions = actions;
    }

    public List<ActionsExecutionFlowDTO> getActionsExecutionFlow() {
        return actionsExecutionFlow;
    }

    public void setActionsExecutionFlow(List<ActionsExecutionFlowDTO> actionsExecutionFlow) {
        this.actionsExecutionFlow = actionsExecutionFlow;
    }

    public static class ParamDTO {
        private String paramName;

        private  String paramValue;

        public ParamDTO() {
        }

        public ParamDTO(String paramName, String paramValue) {
            this.paramName = paramName;
            this.paramValue = paramValue;
        }

        public String getParamName() {
            return paramName;
        }

        public void setParamName(String paramName) {
            this.paramName = paramName;
        }

        public String getParamValue() {
            return paramValue;
        }

        public void setParamValue(String paramValue) {
            this.paramValue = paramValue;
        }
    }

    public static class ActionsExecutionFlowDTO {
        private Integer orderNum;

        private String actionName;

        public ActionsExecutionFlowDTO() {
        }

        public ActionsExecutionFlowDTO(Integer orderNum, String actionName) {
            this.orderNum = orderNum;
            this.actionName = actionName;
        }

        public Integer getOrderNum() {
            return orderNum;
        }

        public void setOrderNum(Integer orderNum) {
            this.orderNum = orderNum;
        }

        public String getActionName() {
            return actionName;
        }

        public void setActionName(String actionName) {
            this.actionName = actionName;
        }
    }

    public static class ActionDTO {
        private String actionName;

        private String actionType;

        private String action;

        public ActionDTO() {
        }

        public ActionDTO(String actionName, String actionType, String action) {
            this.actionName = actionName;
            this.actionType = actionType;
            this.action = action;
        }

        public String getActionName() {
            return actionName;
        }

        public void setActionName(String actionName) {
            this.actionName = actionName;
        }

        public String getActionType() {
            return actionType;
        }

        public void setActionType(String actionType) {
            this.actionType = actionType;
        }

        public String getAction() {
            return action;
        }

        public void setAction(String action) {
            this.action = action;
        }
    }
}
