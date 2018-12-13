package com.mh.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TBetRecordBbinExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TBetRecordBbinExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andWebFlagIsNull() {
            addCriterion("web_flag is null");
            return (Criteria) this;
        }

        public Criteria andWebFlagIsNotNull() {
            addCriterion("web_flag is not null");
            return (Criteria) this;
        }

        public Criteria andWebFlagEqualTo(String value) {
            addCriterion("web_flag =", value, "webFlag");
            return (Criteria) this;
        }

        public Criteria andWebFlagNotEqualTo(String value) {
            addCriterion("web_flag <>", value, "webFlag");
            return (Criteria) this;
        }

        public Criteria andWebFlagGreaterThan(String value) {
            addCriterion("web_flag >", value, "webFlag");
            return (Criteria) this;
        }

        public Criteria andWebFlagGreaterThanOrEqualTo(String value) {
            addCriterion("web_flag >=", value, "webFlag");
            return (Criteria) this;
        }

        public Criteria andWebFlagLessThan(String value) {
            addCriterion("web_flag <", value, "webFlag");
            return (Criteria) this;
        }

        public Criteria andWebFlagLessThanOrEqualTo(String value) {
            addCriterion("web_flag <=", value, "webFlag");
            return (Criteria) this;
        }

        public Criteria andWebFlagLike(String value) {
            addCriterion("web_flag like", value, "webFlag");
            return (Criteria) this;
        }

        public Criteria andWebFlagNotLike(String value) {
            addCriterion("web_flag not like", value, "webFlag");
            return (Criteria) this;
        }

        public Criteria andWebFlagIn(List<String> values) {
            addCriterion("web_flag in", values, "webFlag");
            return (Criteria) this;
        }

        public Criteria andWebFlagNotIn(List<String> values) {
            addCriterion("web_flag not in", values, "webFlag");
            return (Criteria) this;
        }

        public Criteria andWebFlagBetween(String value1, String value2) {
            addCriterion("web_flag between", value1, value2, "webFlag");
            return (Criteria) this;
        }

        public Criteria andWebFlagNotBetween(String value1, String value2) {
            addCriterion("web_flag not between", value1, value2, "webFlag");
            return (Criteria) this;
        }

        public Criteria andWebRemarkIsNull() {
            addCriterion("web_remark is null");
            return (Criteria) this;
        }

        public Criteria andWebRemarkIsNotNull() {
            addCriterion("web_remark is not null");
            return (Criteria) this;
        }

        public Criteria andWebRemarkEqualTo(String value) {
            addCriterion("web_remark =", value, "webRemark");
            return (Criteria) this;
        }

        public Criteria andWebRemarkNotEqualTo(String value) {
            addCriterion("web_remark <>", value, "webRemark");
            return (Criteria) this;
        }

        public Criteria andWebRemarkGreaterThan(String value) {
            addCriterion("web_remark >", value, "webRemark");
            return (Criteria) this;
        }

        public Criteria andWebRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("web_remark >=", value, "webRemark");
            return (Criteria) this;
        }

        public Criteria andWebRemarkLessThan(String value) {
            addCriterion("web_remark <", value, "webRemark");
            return (Criteria) this;
        }

        public Criteria andWebRemarkLessThanOrEqualTo(String value) {
            addCriterion("web_remark <=", value, "webRemark");
            return (Criteria) this;
        }

        public Criteria andWebRemarkLike(String value) {
            addCriterion("web_remark like", value, "webRemark");
            return (Criteria) this;
        }

        public Criteria andWebRemarkNotLike(String value) {
            addCriterion("web_remark not like", value, "webRemark");
            return (Criteria) this;
        }

        public Criteria andWebRemarkIn(List<String> values) {
            addCriterion("web_remark in", values, "webRemark");
            return (Criteria) this;
        }

        public Criteria andWebRemarkNotIn(List<String> values) {
            addCriterion("web_remark not in", values, "webRemark");
            return (Criteria) this;
        }

        public Criteria andWebRemarkBetween(String value1, String value2) {
            addCriterion("web_remark between", value1, value2, "webRemark");
            return (Criteria) this;
        }

        public Criteria andWebRemarkNotBetween(String value1, String value2) {
            addCriterion("web_remark not between", value1, value2, "webRemark");
            return (Criteria) this;
        }

        public Criteria andBetUserNameIsNull() {
            addCriterion("bet_user_name is null");
            return (Criteria) this;
        }

        public Criteria andBetUserNameIsNotNull() {
            addCriterion("bet_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andBetUserNameEqualTo(String value) {
            addCriterion("bet_user_name =", value, "betUserName");
            return (Criteria) this;
        }

        public Criteria andBetUserNameNotEqualTo(String value) {
            addCriterion("bet_user_name <>", value, "betUserName");
            return (Criteria) this;
        }

        public Criteria andBetUserNameGreaterThan(String value) {
            addCriterion("bet_user_name >", value, "betUserName");
            return (Criteria) this;
        }

        public Criteria andBetUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("bet_user_name >=", value, "betUserName");
            return (Criteria) this;
        }

        public Criteria andBetUserNameLessThan(String value) {
            addCriterion("bet_user_name <", value, "betUserName");
            return (Criteria) this;
        }

        public Criteria andBetUserNameLessThanOrEqualTo(String value) {
            addCriterion("bet_user_name <=", value, "betUserName");
            return (Criteria) this;
        }

        public Criteria andBetUserNameLike(String value) {
            addCriterion("bet_user_name like", value, "betUserName");
            return (Criteria) this;
        }

        public Criteria andBetUserNameNotLike(String value) {
            addCriterion("bet_user_name not like", value, "betUserName");
            return (Criteria) this;
        }

        public Criteria andBetUserNameIn(List<String> values) {
            addCriterion("bet_user_name in", values, "betUserName");
            return (Criteria) this;
        }

        public Criteria andBetUserNameNotIn(List<String> values) {
            addCriterion("bet_user_name not in", values, "betUserName");
            return (Criteria) this;
        }

        public Criteria andBetUserNameBetween(String value1, String value2) {
            addCriterion("bet_user_name between", value1, value2, "betUserName");
            return (Criteria) this;
        }

        public Criteria andBetUserNameNotBetween(String value1, String value2) {
            addCriterion("bet_user_name not between", value1, value2, "betUserName");
            return (Criteria) this;
        }

        public Criteria andBetFlatAccountIsNull() {
            addCriterion("bet_flat_account is null");
            return (Criteria) this;
        }

        public Criteria andBetFlatAccountIsNotNull() {
            addCriterion("bet_flat_account is not null");
            return (Criteria) this;
        }

        public Criteria andBetFlatAccountEqualTo(String value) {
            addCriterion("bet_flat_account =", value, "betFlatAccount");
            return (Criteria) this;
        }

        public Criteria andBetFlatAccountNotEqualTo(String value) {
            addCriterion("bet_flat_account <>", value, "betFlatAccount");
            return (Criteria) this;
        }

        public Criteria andBetFlatAccountGreaterThan(String value) {
            addCriterion("bet_flat_account >", value, "betFlatAccount");
            return (Criteria) this;
        }

        public Criteria andBetFlatAccountGreaterThanOrEqualTo(String value) {
            addCriterion("bet_flat_account >=", value, "betFlatAccount");
            return (Criteria) this;
        }

        public Criteria andBetFlatAccountLessThan(String value) {
            addCriterion("bet_flat_account <", value, "betFlatAccount");
            return (Criteria) this;
        }

        public Criteria andBetFlatAccountLessThanOrEqualTo(String value) {
            addCriterion("bet_flat_account <=", value, "betFlatAccount");
            return (Criteria) this;
        }

        public Criteria andBetFlatAccountLike(String value) {
            addCriterion("bet_flat_account like", value, "betFlatAccount");
            return (Criteria) this;
        }

        public Criteria andBetFlatAccountNotLike(String value) {
            addCriterion("bet_flat_account not like", value, "betFlatAccount");
            return (Criteria) this;
        }

        public Criteria andBetFlatAccountIn(List<String> values) {
            addCriterion("bet_flat_account in", values, "betFlatAccount");
            return (Criteria) this;
        }

        public Criteria andBetFlatAccountNotIn(List<String> values) {
            addCriterion("bet_flat_account not in", values, "betFlatAccount");
            return (Criteria) this;
        }

        public Criteria andBetFlatAccountBetween(String value1, String value2) {
            addCriterion("bet_flat_account between", value1, value2, "betFlatAccount");
            return (Criteria) this;
        }

        public Criteria andBetFlatAccountNotBetween(String value1, String value2) {
            addCriterion("bet_flat_account not between", value1, value2, "betFlatAccount");
            return (Criteria) this;
        }

        public Criteria andBetGameContentIsNull() {
            addCriterion("bet_game_content is null");
            return (Criteria) this;
        }

        public Criteria andBetGameContentIsNotNull() {
            addCriterion("bet_game_content is not null");
            return (Criteria) this;
        }

        public Criteria andBetGameContentEqualTo(String value) {
            addCriterion("bet_game_content =", value, "betGameContent");
            return (Criteria) this;
        }

        public Criteria andBetGameContentNotEqualTo(String value) {
            addCriterion("bet_game_content <>", value, "betGameContent");
            return (Criteria) this;
        }

        public Criteria andBetGameContentGreaterThan(String value) {
            addCriterion("bet_game_content >", value, "betGameContent");
            return (Criteria) this;
        }

        public Criteria andBetGameContentGreaterThanOrEqualTo(String value) {
            addCriterion("bet_game_content >=", value, "betGameContent");
            return (Criteria) this;
        }

        public Criteria andBetGameContentLessThan(String value) {
            addCriterion("bet_game_content <", value, "betGameContent");
            return (Criteria) this;
        }

        public Criteria andBetGameContentLessThanOrEqualTo(String value) {
            addCriterion("bet_game_content <=", value, "betGameContent");
            return (Criteria) this;
        }

        public Criteria andBetGameContentLike(String value) {
            addCriterion("bet_game_content like", value, "betGameContent");
            return (Criteria) this;
        }

        public Criteria andBetGameContentNotLike(String value) {
            addCriterion("bet_game_content not like", value, "betGameContent");
            return (Criteria) this;
        }

        public Criteria andBetGameContentIn(List<String> values) {
            addCriterion("bet_game_content in", values, "betGameContent");
            return (Criteria) this;
        }

        public Criteria andBetGameContentNotIn(List<String> values) {
            addCriterion("bet_game_content not in", values, "betGameContent");
            return (Criteria) this;
        }

        public Criteria andBetGameContentBetween(String value1, String value2) {
            addCriterion("bet_game_content between", value1, value2, "betGameContent");
            return (Criteria) this;
        }

        public Criteria andBetGameContentNotBetween(String value1, String value2) {
            addCriterion("bet_game_content not between", value1, value2, "betGameContent");
            return (Criteria) this;
        }

        public Criteria andBetGameResultIsNull() {
            addCriterion("bet_game_result is null");
            return (Criteria) this;
        }

        public Criteria andBetGameResultIsNotNull() {
            addCriterion("bet_game_result is not null");
            return (Criteria) this;
        }

        public Criteria andBetGameResultEqualTo(String value) {
            addCriterion("bet_game_result =", value, "betGameResult");
            return (Criteria) this;
        }

        public Criteria andBetGameResultNotEqualTo(String value) {
            addCriterion("bet_game_result <>", value, "betGameResult");
            return (Criteria) this;
        }

        public Criteria andBetGameResultGreaterThan(String value) {
            addCriterion("bet_game_result >", value, "betGameResult");
            return (Criteria) this;
        }

        public Criteria andBetGameResultGreaterThanOrEqualTo(String value) {
            addCriterion("bet_game_result >=", value, "betGameResult");
            return (Criteria) this;
        }

        public Criteria andBetGameResultLessThan(String value) {
            addCriterion("bet_game_result <", value, "betGameResult");
            return (Criteria) this;
        }

        public Criteria andBetGameResultLessThanOrEqualTo(String value) {
            addCriterion("bet_game_result <=", value, "betGameResult");
            return (Criteria) this;
        }

        public Criteria andBetGameResultLike(String value) {
            addCriterion("bet_game_result like", value, "betGameResult");
            return (Criteria) this;
        }

        public Criteria andBetGameResultNotLike(String value) {
            addCriterion("bet_game_result not like", value, "betGameResult");
            return (Criteria) this;
        }

        public Criteria andBetGameResultIn(List<String> values) {
            addCriterion("bet_game_result in", values, "betGameResult");
            return (Criteria) this;
        }

        public Criteria andBetGameResultNotIn(List<String> values) {
            addCriterion("bet_game_result not in", values, "betGameResult");
            return (Criteria) this;
        }

        public Criteria andBetGameResultBetween(String value1, String value2) {
            addCriterion("bet_game_result between", value1, value2, "betGameResult");
            return (Criteria) this;
        }

        public Criteria andBetGameResultNotBetween(String value1, String value2) {
            addCriterion("bet_game_result not between", value1, value2, "betGameResult");
            return (Criteria) this;
        }

        public Criteria andBetContentIsNull() {
            addCriterion("bet_content is null");
            return (Criteria) this;
        }

        public Criteria andBetContentIsNotNull() {
            addCriterion("bet_content is not null");
            return (Criteria) this;
        }

        public Criteria andBetContentEqualTo(String value) {
            addCriterion("bet_content =", value, "betContent");
            return (Criteria) this;
        }

        public Criteria andBetContentNotEqualTo(String value) {
            addCriterion("bet_content <>", value, "betContent");
            return (Criteria) this;
        }

        public Criteria andBetContentGreaterThan(String value) {
            addCriterion("bet_content >", value, "betContent");
            return (Criteria) this;
        }

        public Criteria andBetContentGreaterThanOrEqualTo(String value) {
            addCriterion("bet_content >=", value, "betContent");
            return (Criteria) this;
        }

        public Criteria andBetContentLessThan(String value) {
            addCriterion("bet_content <", value, "betContent");
            return (Criteria) this;
        }

        public Criteria andBetContentLessThanOrEqualTo(String value) {
            addCriterion("bet_content <=", value, "betContent");
            return (Criteria) this;
        }

        public Criteria andBetContentLike(String value) {
            addCriterion("bet_content like", value, "betContent");
            return (Criteria) this;
        }

        public Criteria andBetContentNotLike(String value) {
            addCriterion("bet_content not like", value, "betContent");
            return (Criteria) this;
        }

        public Criteria andBetContentIn(List<String> values) {
            addCriterion("bet_content in", values, "betContent");
            return (Criteria) this;
        }

        public Criteria andBetContentNotIn(List<String> values) {
            addCriterion("bet_content not in", values, "betContent");
            return (Criteria) this;
        }

        public Criteria andBetContentBetween(String value1, String value2) {
            addCriterion("bet_content between", value1, value2, "betContent");
            return (Criteria) this;
        }

        public Criteria andBetContentNotBetween(String value1, String value2) {
            addCriterion("bet_content not between", value1, value2, "betContent");
            return (Criteria) this;
        }

        public Criteria andBetGameHallIsNull() {
            addCriterion("bet_game_hall is null");
            return (Criteria) this;
        }

        public Criteria andBetGameHallIsNotNull() {
            addCriterion("bet_game_hall is not null");
            return (Criteria) this;
        }

        public Criteria andBetGameHallEqualTo(String value) {
            addCriterion("bet_game_hall =", value, "betGameHall");
            return (Criteria) this;
        }

        public Criteria andBetGameHallNotEqualTo(String value) {
            addCriterion("bet_game_hall <>", value, "betGameHall");
            return (Criteria) this;
        }

        public Criteria andBetGameHallGreaterThan(String value) {
            addCriterion("bet_game_hall >", value, "betGameHall");
            return (Criteria) this;
        }

        public Criteria andBetGameHallGreaterThanOrEqualTo(String value) {
            addCriterion("bet_game_hall >=", value, "betGameHall");
            return (Criteria) this;
        }

        public Criteria andBetGameHallLessThan(String value) {
            addCriterion("bet_game_hall <", value, "betGameHall");
            return (Criteria) this;
        }

        public Criteria andBetGameHallLessThanOrEqualTo(String value) {
            addCriterion("bet_game_hall <=", value, "betGameHall");
            return (Criteria) this;
        }

        public Criteria andBetGameHallLike(String value) {
            addCriterion("bet_game_hall like", value, "betGameHall");
            return (Criteria) this;
        }

        public Criteria andBetGameHallNotLike(String value) {
            addCriterion("bet_game_hall not like", value, "betGameHall");
            return (Criteria) this;
        }

        public Criteria andBetGameHallIn(List<String> values) {
            addCriterion("bet_game_hall in", values, "betGameHall");
            return (Criteria) this;
        }

        public Criteria andBetGameHallNotIn(List<String> values) {
            addCriterion("bet_game_hall not in", values, "betGameHall");
            return (Criteria) this;
        }

        public Criteria andBetGameHallBetween(String value1, String value2) {
            addCriterion("bet_game_hall between", value1, value2, "betGameHall");
            return (Criteria) this;
        }

        public Criteria andBetGameHallNotBetween(String value1, String value2) {
            addCriterion("bet_game_hall not between", value1, value2, "betGameHall");
            return (Criteria) this;
        }

        public Criteria andBetGameRoomIsNull() {
            addCriterion("bet_game_room is null");
            return (Criteria) this;
        }

        public Criteria andBetGameRoomIsNotNull() {
            addCriterion("bet_game_room is not null");
            return (Criteria) this;
        }

        public Criteria andBetGameRoomEqualTo(String value) {
            addCriterion("bet_game_room =", value, "betGameRoom");
            return (Criteria) this;
        }

        public Criteria andBetGameRoomNotEqualTo(String value) {
            addCriterion("bet_game_room <>", value, "betGameRoom");
            return (Criteria) this;
        }

        public Criteria andBetGameRoomGreaterThan(String value) {
            addCriterion("bet_game_room >", value, "betGameRoom");
            return (Criteria) this;
        }

        public Criteria andBetGameRoomGreaterThanOrEqualTo(String value) {
            addCriterion("bet_game_room >=", value, "betGameRoom");
            return (Criteria) this;
        }

        public Criteria andBetGameRoomLessThan(String value) {
            addCriterion("bet_game_room <", value, "betGameRoom");
            return (Criteria) this;
        }

        public Criteria andBetGameRoomLessThanOrEqualTo(String value) {
            addCriterion("bet_game_room <=", value, "betGameRoom");
            return (Criteria) this;
        }

        public Criteria andBetGameRoomLike(String value) {
            addCriterion("bet_game_room like", value, "betGameRoom");
            return (Criteria) this;
        }

        public Criteria andBetGameRoomNotLike(String value) {
            addCriterion("bet_game_room not like", value, "betGameRoom");
            return (Criteria) this;
        }

        public Criteria andBetGameRoomIn(List<String> values) {
            addCriterion("bet_game_room in", values, "betGameRoom");
            return (Criteria) this;
        }

        public Criteria andBetGameRoomNotIn(List<String> values) {
            addCriterion("bet_game_room not in", values, "betGameRoom");
            return (Criteria) this;
        }

        public Criteria andBetGameRoomBetween(String value1, String value2) {
            addCriterion("bet_game_room between", value1, value2, "betGameRoom");
            return (Criteria) this;
        }

        public Criteria andBetGameRoomNotBetween(String value1, String value2) {
            addCriterion("bet_game_room not between", value1, value2, "betGameRoom");
            return (Criteria) this;
        }

        public Criteria andBetGameTableIsNull() {
            addCriterion("bet_game_table is null");
            return (Criteria) this;
        }

        public Criteria andBetGameTableIsNotNull() {
            addCriterion("bet_game_table is not null");
            return (Criteria) this;
        }

        public Criteria andBetGameTableEqualTo(String value) {
            addCriterion("bet_game_table =", value, "betGameTable");
            return (Criteria) this;
        }

        public Criteria andBetGameTableNotEqualTo(String value) {
            addCriterion("bet_game_table <>", value, "betGameTable");
            return (Criteria) this;
        }

        public Criteria andBetGameTableGreaterThan(String value) {
            addCriterion("bet_game_table >", value, "betGameTable");
            return (Criteria) this;
        }

        public Criteria andBetGameTableGreaterThanOrEqualTo(String value) {
            addCriterion("bet_game_table >=", value, "betGameTable");
            return (Criteria) this;
        }

        public Criteria andBetGameTableLessThan(String value) {
            addCriterion("bet_game_table <", value, "betGameTable");
            return (Criteria) this;
        }

        public Criteria andBetGameTableLessThanOrEqualTo(String value) {
            addCriterion("bet_game_table <=", value, "betGameTable");
            return (Criteria) this;
        }

        public Criteria andBetGameTableLike(String value) {
            addCriterion("bet_game_table like", value, "betGameTable");
            return (Criteria) this;
        }

        public Criteria andBetGameTableNotLike(String value) {
            addCriterion("bet_game_table not like", value, "betGameTable");
            return (Criteria) this;
        }

        public Criteria andBetGameTableIn(List<String> values) {
            addCriterion("bet_game_table in", values, "betGameTable");
            return (Criteria) this;
        }

        public Criteria andBetGameTableNotIn(List<String> values) {
            addCriterion("bet_game_table not in", values, "betGameTable");
            return (Criteria) this;
        }

        public Criteria andBetGameTableBetween(String value1, String value2) {
            addCriterion("bet_game_table between", value1, value2, "betGameTable");
            return (Criteria) this;
        }

        public Criteria andBetGameTableNotBetween(String value1, String value2) {
            addCriterion("bet_game_table not between", value1, value2, "betGameTable");
            return (Criteria) this;
        }

        public Criteria andBetGameCodeIsNull() {
            addCriterion("bet_game_code is null");
            return (Criteria) this;
        }

        public Criteria andBetGameCodeIsNotNull() {
            addCriterion("bet_game_code is not null");
            return (Criteria) this;
        }

        public Criteria andBetGameCodeEqualTo(String value) {
            addCriterion("bet_game_code =", value, "betGameCode");
            return (Criteria) this;
        }

        public Criteria andBetGameCodeNotEqualTo(String value) {
            addCriterion("bet_game_code <>", value, "betGameCode");
            return (Criteria) this;
        }

        public Criteria andBetGameCodeGreaterThan(String value) {
            addCriterion("bet_game_code >", value, "betGameCode");
            return (Criteria) this;
        }

        public Criteria andBetGameCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bet_game_code >=", value, "betGameCode");
            return (Criteria) this;
        }

        public Criteria andBetGameCodeLessThan(String value) {
            addCriterion("bet_game_code <", value, "betGameCode");
            return (Criteria) this;
        }

        public Criteria andBetGameCodeLessThanOrEqualTo(String value) {
            addCriterion("bet_game_code <=", value, "betGameCode");
            return (Criteria) this;
        }

        public Criteria andBetGameCodeLike(String value) {
            addCriterion("bet_game_code like", value, "betGameCode");
            return (Criteria) this;
        }

        public Criteria andBetGameCodeNotLike(String value) {
            addCriterion("bet_game_code not like", value, "betGameCode");
            return (Criteria) this;
        }

        public Criteria andBetGameCodeIn(List<String> values) {
            addCriterion("bet_game_code in", values, "betGameCode");
            return (Criteria) this;
        }

        public Criteria andBetGameCodeNotIn(List<String> values) {
            addCriterion("bet_game_code not in", values, "betGameCode");
            return (Criteria) this;
        }

        public Criteria andBetGameCodeBetween(String value1, String value2) {
            addCriterion("bet_game_code between", value1, value2, "betGameCode");
            return (Criteria) this;
        }

        public Criteria andBetGameCodeNotBetween(String value1, String value2) {
            addCriterion("bet_game_code not between", value1, value2, "betGameCode");
            return (Criteria) this;
        }

        public Criteria andBetWagersIdIsNull() {
            addCriterion("bet_Wagers_id is null");
            return (Criteria) this;
        }

        public Criteria andBetWagersIdIsNotNull() {
            addCriterion("bet_Wagers_id is not null");
            return (Criteria) this;
        }

        public Criteria andBetWagersIdEqualTo(String value) {
            addCriterion("bet_Wagers_id =", value, "betWagersId");
            return (Criteria) this;
        }

        public Criteria andBetWagersIdNotEqualTo(String value) {
            addCriterion("bet_Wagers_id <>", value, "betWagersId");
            return (Criteria) this;
        }

        public Criteria andBetWagersIdGreaterThan(String value) {
            addCriterion("bet_Wagers_id >", value, "betWagersId");
            return (Criteria) this;
        }

        public Criteria andBetWagersIdGreaterThanOrEqualTo(String value) {
            addCriterion("bet_Wagers_id >=", value, "betWagersId");
            return (Criteria) this;
        }

        public Criteria andBetWagersIdLessThan(String value) {
            addCriterion("bet_Wagers_id <", value, "betWagersId");
            return (Criteria) this;
        }

        public Criteria andBetWagersIdLessThanOrEqualTo(String value) {
            addCriterion("bet_Wagers_id <=", value, "betWagersId");
            return (Criteria) this;
        }

        public Criteria andBetWagersIdLike(String value) {
            addCriterion("bet_Wagers_id like", value, "betWagersId");
            return (Criteria) this;
        }

        public Criteria andBetWagersIdNotLike(String value) {
            addCriterion("bet_Wagers_id not like", value, "betWagersId");
            return (Criteria) this;
        }

        public Criteria andBetWagersIdIn(List<String> values) {
            addCriterion("bet_Wagers_id in", values, "betWagersId");
            return (Criteria) this;
        }

        public Criteria andBetWagersIdNotIn(List<String> values) {
            addCriterion("bet_Wagers_id not in", values, "betWagersId");
            return (Criteria) this;
        }

        public Criteria andBetWagersIdBetween(String value1, String value2) {
            addCriterion("bet_Wagers_id between", value1, value2, "betWagersId");
            return (Criteria) this;
        }

        public Criteria andBetWagersIdNotBetween(String value1, String value2) {
            addCriterion("bet_Wagers_id not between", value1, value2, "betWagersId");
            return (Criteria) this;
        }

        public Criteria andBetInIsNull() {
            addCriterion("bet_in is null");
            return (Criteria) this;
        }

        public Criteria andBetInIsNotNull() {
            addCriterion("bet_in is not null");
            return (Criteria) this;
        }

        public Criteria andBetInEqualTo(Double value) {
            addCriterion("bet_in =", value, "betIn");
            return (Criteria) this;
        }

        public Criteria andBetInNotEqualTo(Double value) {
            addCriterion("bet_in <>", value, "betIn");
            return (Criteria) this;
        }

        public Criteria andBetInGreaterThan(Double value) {
            addCriterion("bet_in >", value, "betIn");
            return (Criteria) this;
        }

        public Criteria andBetInGreaterThanOrEqualTo(Double value) {
            addCriterion("bet_in >=", value, "betIn");
            return (Criteria) this;
        }

        public Criteria andBetInLessThan(Double value) {
            addCriterion("bet_in <", value, "betIn");
            return (Criteria) this;
        }

        public Criteria andBetInLessThanOrEqualTo(Double value) {
            addCriterion("bet_in <=", value, "betIn");
            return (Criteria) this;
        }

        public Criteria andBetInIn(List<Double> values) {
            addCriterion("bet_in in", values, "betIn");
            return (Criteria) this;
        }

        public Criteria andBetInNotIn(List<Double> values) {
            addCriterion("bet_in not in", values, "betIn");
            return (Criteria) this;
        }

        public Criteria andBetInBetween(Double value1, Double value2) {
            addCriterion("bet_in between", value1, value2, "betIn");
            return (Criteria) this;
        }

        public Criteria andBetInNotBetween(Double value1, Double value2) {
            addCriterion("bet_in not between", value1, value2, "betIn");
            return (Criteria) this;
        }

        public Criteria andBetIncomeIsNull() {
            addCriterion("bet_income is null");
            return (Criteria) this;
        }

        public Criteria andBetIncomeIsNotNull() {
            addCriterion("bet_income is not null");
            return (Criteria) this;
        }

        public Criteria andBetIncomeEqualTo(Double value) {
            addCriterion("bet_income =", value, "betIncome");
            return (Criteria) this;
        }

        public Criteria andBetIncomeNotEqualTo(Double value) {
            addCriterion("bet_income <>", value, "betIncome");
            return (Criteria) this;
        }

        public Criteria andBetIncomeGreaterThan(Double value) {
            addCriterion("bet_income >", value, "betIncome");
            return (Criteria) this;
        }

        public Criteria andBetIncomeGreaterThanOrEqualTo(Double value) {
            addCriterion("bet_income >=", value, "betIncome");
            return (Criteria) this;
        }

        public Criteria andBetIncomeLessThan(Double value) {
            addCriterion("bet_income <", value, "betIncome");
            return (Criteria) this;
        }

        public Criteria andBetIncomeLessThanOrEqualTo(Double value) {
            addCriterion("bet_income <=", value, "betIncome");
            return (Criteria) this;
        }

        public Criteria andBetIncomeIn(List<Double> values) {
            addCriterion("bet_income in", values, "betIncome");
            return (Criteria) this;
        }

        public Criteria andBetIncomeNotIn(List<Double> values) {
            addCriterion("bet_income not in", values, "betIncome");
            return (Criteria) this;
        }

        public Criteria andBetIncomeBetween(Double value1, Double value2) {
            addCriterion("bet_income between", value1, value2, "betIncome");
            return (Criteria) this;
        }

        public Criteria andBetIncomeNotBetween(Double value1, Double value2) {
            addCriterion("bet_income not between", value1, value2, "betIncome");
            return (Criteria) this;
        }

        public Criteria andBetUsrWinIsNull() {
            addCriterion("bet_usr_win is null");
            return (Criteria) this;
        }

        public Criteria andBetUsrWinIsNotNull() {
            addCriterion("bet_usr_win is not null");
            return (Criteria) this;
        }

        public Criteria andBetUsrWinEqualTo(Double value) {
            addCriterion("bet_usr_win =", value, "betUsrWin");
            return (Criteria) this;
        }

        public Criteria andBetUsrWinNotEqualTo(Double value) {
            addCriterion("bet_usr_win <>", value, "betUsrWin");
            return (Criteria) this;
        }

        public Criteria andBetUsrWinGreaterThan(Double value) {
            addCriterion("bet_usr_win >", value, "betUsrWin");
            return (Criteria) this;
        }

        public Criteria andBetUsrWinGreaterThanOrEqualTo(Double value) {
            addCriterion("bet_usr_win >=", value, "betUsrWin");
            return (Criteria) this;
        }

        public Criteria andBetUsrWinLessThan(Double value) {
            addCriterion("bet_usr_win <", value, "betUsrWin");
            return (Criteria) this;
        }

        public Criteria andBetUsrWinLessThanOrEqualTo(Double value) {
            addCriterion("bet_usr_win <=", value, "betUsrWin");
            return (Criteria) this;
        }

        public Criteria andBetUsrWinIn(List<Double> values) {
            addCriterion("bet_usr_win in", values, "betUsrWin");
            return (Criteria) this;
        }

        public Criteria andBetUsrWinNotIn(List<Double> values) {
            addCriterion("bet_usr_win not in", values, "betUsrWin");
            return (Criteria) this;
        }

        public Criteria andBetUsrWinBetween(Double value1, Double value2) {
            addCriterion("bet_usr_win between", value1, value2, "betUsrWin");
            return (Criteria) this;
        }

        public Criteria andBetUsrWinNotBetween(Double value1, Double value2) {
            addCriterion("bet_usr_win not between", value1, value2, "betUsrWin");
            return (Criteria) this;
        }

        public Criteria andBetNetWinIsNull() {
            addCriterion("bet_net_win is null");
            return (Criteria) this;
        }

        public Criteria andBetNetWinIsNotNull() {
            addCriterion("bet_net_win is not null");
            return (Criteria) this;
        }

        public Criteria andBetNetWinEqualTo(Double value) {
            addCriterion("bet_net_win =", value, "betNetWin");
            return (Criteria) this;
        }

        public Criteria andBetNetWinNotEqualTo(Double value) {
            addCriterion("bet_net_win <>", value, "betNetWin");
            return (Criteria) this;
        }

        public Criteria andBetNetWinGreaterThan(Double value) {
            addCriterion("bet_net_win >", value, "betNetWin");
            return (Criteria) this;
        }

        public Criteria andBetNetWinGreaterThanOrEqualTo(Double value) {
            addCriterion("bet_net_win >=", value, "betNetWin");
            return (Criteria) this;
        }

        public Criteria andBetNetWinLessThan(Double value) {
            addCriterion("bet_net_win <", value, "betNetWin");
            return (Criteria) this;
        }

        public Criteria andBetNetWinLessThanOrEqualTo(Double value) {
            addCriterion("bet_net_win <=", value, "betNetWin");
            return (Criteria) this;
        }

        public Criteria andBetNetWinIn(List<Double> values) {
            addCriterion("bet_net_win in", values, "betNetWin");
            return (Criteria) this;
        }

        public Criteria andBetNetWinNotIn(List<Double> values) {
            addCriterion("bet_net_win not in", values, "betNetWin");
            return (Criteria) this;
        }

        public Criteria andBetNetWinBetween(Double value1, Double value2) {
            addCriterion("bet_net_win between", value1, value2, "betNetWin");
            return (Criteria) this;
        }

        public Criteria andBetNetWinNotBetween(Double value1, Double value2) {
            addCriterion("bet_net_win not between", value1, value2, "betNetWin");
            return (Criteria) this;
        }

        public Criteria andBetTimeIsNull() {
            addCriterion("bet_time is null");
            return (Criteria) this;
        }

        public Criteria andBetTimeIsNotNull() {
            addCriterion("bet_time is not null");
            return (Criteria) this;
        }

        public Criteria andBetTimeEqualTo(Date value) {
            addCriterion("bet_time =", value, "betTime");
            return (Criteria) this;
        }

        public Criteria andBetTimeNotEqualTo(Date value) {
            addCriterion("bet_time <>", value, "betTime");
            return (Criteria) this;
        }

        public Criteria andBetTimeGreaterThan(Date value) {
            addCriterion("bet_time >", value, "betTime");
            return (Criteria) this;
        }

        public Criteria andBetTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bet_time >=", value, "betTime");
            return (Criteria) this;
        }

        public Criteria andBetTimeLessThan(Date value) {
            addCriterion("bet_time <", value, "betTime");
            return (Criteria) this;
        }

        public Criteria andBetTimeLessThanOrEqualTo(Date value) {
            addCriterion("bet_time <=", value, "betTime");
            return (Criteria) this;
        }

        public Criteria andBetTimeIn(List<Date> values) {
            addCriterion("bet_time in", values, "betTime");
            return (Criteria) this;
        }

        public Criteria andBetTimeNotIn(List<Date> values) {
            addCriterion("bet_time not in", values, "betTime");
            return (Criteria) this;
        }

        public Criteria andBetTimeBetween(Date value1, Date value2) {
            addCriterion("bet_time between", value1, value2, "betTime");
            return (Criteria) this;
        }

        public Criteria andBetTimeNotBetween(Date value1, Date value2) {
            addCriterion("bet_time not between", value1, value2, "betTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andBackWaterIsNull() {
            addCriterion("back_water is null");
            return (Criteria) this;
        }

        public Criteria andBackWaterIsNotNull() {
            addCriterion("back_water is not null");
            return (Criteria) this;
        }

        public Criteria andBackWaterEqualTo(String value) {
            addCriterion("back_water =", value, "backWater");
            return (Criteria) this;
        }

        public Criteria andBackWaterNotEqualTo(String value) {
            addCriterion("back_water <>", value, "backWater");
            return (Criteria) this;
        }

        public Criteria andBackWaterGreaterThan(String value) {
            addCriterion("back_water >", value, "backWater");
            return (Criteria) this;
        }

        public Criteria andBackWaterGreaterThanOrEqualTo(String value) {
            addCriterion("back_water >=", value, "backWater");
            return (Criteria) this;
        }

        public Criteria andBackWaterLessThan(String value) {
            addCriterion("back_water <", value, "backWater");
            return (Criteria) this;
        }

        public Criteria andBackWaterLessThanOrEqualTo(String value) {
            addCriterion("back_water <=", value, "backWater");
            return (Criteria) this;
        }

        public Criteria andBackWaterLike(String value) {
            addCriterion("back_water like", value, "backWater");
            return (Criteria) this;
        }

        public Criteria andBackWaterNotLike(String value) {
            addCriterion("back_water not like", value, "backWater");
            return (Criteria) this;
        }

        public Criteria andBackWaterIn(List<String> values) {
            addCriterion("back_water in", values, "backWater");
            return (Criteria) this;
        }

        public Criteria andBackWaterNotIn(List<String> values) {
            addCriterion("back_water not in", values, "backWater");
            return (Criteria) this;
        }

        public Criteria andBackWaterBetween(String value1, String value2) {
            addCriterion("back_water between", value1, value2, "backWater");
            return (Criteria) this;
        }

        public Criteria andBackWaterNotBetween(String value1, String value2) {
            addCriterion("back_water not between", value1, value2, "backWater");
            return (Criteria) this;
        }

        public Criteria andBackWaterStatusIsNull() {
            addCriterion("back_water_status is null");
            return (Criteria) this;
        }

        public Criteria andBackWaterStatusIsNotNull() {
            addCriterion("back_water_status is not null");
            return (Criteria) this;
        }

        public Criteria andBackWaterStatusEqualTo(Integer value) {
            addCriterion("back_water_status =", value, "backWaterStatus");
            return (Criteria) this;
        }

        public Criteria andBackWaterStatusNotEqualTo(Integer value) {
            addCriterion("back_water_status <>", value, "backWaterStatus");
            return (Criteria) this;
        }

        public Criteria andBackWaterStatusGreaterThan(Integer value) {
            addCriterion("back_water_status >", value, "backWaterStatus");
            return (Criteria) this;
        }

        public Criteria andBackWaterStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("back_water_status >=", value, "backWaterStatus");
            return (Criteria) this;
        }

        public Criteria andBackWaterStatusLessThan(Integer value) {
            addCriterion("back_water_status <", value, "backWaterStatus");
            return (Criteria) this;
        }

        public Criteria andBackWaterStatusLessThanOrEqualTo(Integer value) {
            addCriterion("back_water_status <=", value, "backWaterStatus");
            return (Criteria) this;
        }

        public Criteria andBackWaterStatusIn(List<Integer> values) {
            addCriterion("back_water_status in", values, "backWaterStatus");
            return (Criteria) this;
        }

        public Criteria andBackWaterStatusNotIn(List<Integer> values) {
            addCriterion("back_water_status not in", values, "backWaterStatus");
            return (Criteria) this;
        }

        public Criteria andBackWaterStatusBetween(Integer value1, Integer value2) {
            addCriterion("back_water_status between", value1, value2, "backWaterStatus");
            return (Criteria) this;
        }

        public Criteria andBackWaterStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("back_water_status not between", value1, value2, "backWaterStatus");
            return (Criteria) this;
        }

        public Criteria andBackWaterTimeIsNull() {
            addCriterion("back_water_time is null");
            return (Criteria) this;
        }

        public Criteria andBackWaterTimeIsNotNull() {
            addCriterion("back_water_time is not null");
            return (Criteria) this;
        }

        public Criteria andBackWaterTimeEqualTo(Date value) {
            addCriterion("back_water_time =", value, "backWaterTime");
            return (Criteria) this;
        }

        public Criteria andBackWaterTimeNotEqualTo(Date value) {
            addCriterion("back_water_time <>", value, "backWaterTime");
            return (Criteria) this;
        }

        public Criteria andBackWaterTimeGreaterThan(Date value) {
            addCriterion("back_water_time >", value, "backWaterTime");
            return (Criteria) this;
        }

        public Criteria andBackWaterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("back_water_time >=", value, "backWaterTime");
            return (Criteria) this;
        }

        public Criteria andBackWaterTimeLessThan(Date value) {
            addCriterion("back_water_time <", value, "backWaterTime");
            return (Criteria) this;
        }

        public Criteria andBackWaterTimeLessThanOrEqualTo(Date value) {
            addCriterion("back_water_time <=", value, "backWaterTime");
            return (Criteria) this;
        }

        public Criteria andBackWaterTimeIn(List<Date> values) {
            addCriterion("back_water_time in", values, "backWaterTime");
            return (Criteria) this;
        }

        public Criteria andBackWaterTimeNotIn(List<Date> values) {
            addCriterion("back_water_time not in", values, "backWaterTime");
            return (Criteria) this;
        }

        public Criteria andBackWaterTimeBetween(Date value1, Date value2) {
            addCriterion("back_water_time between", value1, value2, "backWaterTime");
            return (Criteria) this;
        }

        public Criteria andBackWaterTimeNotBetween(Date value1, Date value2) {
            addCriterion("back_water_time not between", value1, value2, "backWaterTime");
            return (Criteria) this;
        }

        public Criteria andBackSysUserNameIsNull() {
            addCriterion("back_sys_user_name is null");
            return (Criteria) this;
        }

        public Criteria andBackSysUserNameIsNotNull() {
            addCriterion("back_sys_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andBackSysUserNameEqualTo(String value) {
            addCriterion("back_sys_user_name =", value, "backSysUserName");
            return (Criteria) this;
        }

        public Criteria andBackSysUserNameNotEqualTo(String value) {
            addCriterion("back_sys_user_name <>", value, "backSysUserName");
            return (Criteria) this;
        }

        public Criteria andBackSysUserNameGreaterThan(String value) {
            addCriterion("back_sys_user_name >", value, "backSysUserName");
            return (Criteria) this;
        }

        public Criteria andBackSysUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("back_sys_user_name >=", value, "backSysUserName");
            return (Criteria) this;
        }

        public Criteria andBackSysUserNameLessThan(String value) {
            addCriterion("back_sys_user_name <", value, "backSysUserName");
            return (Criteria) this;
        }

        public Criteria andBackSysUserNameLessThanOrEqualTo(String value) {
            addCriterion("back_sys_user_name <=", value, "backSysUserName");
            return (Criteria) this;
        }

        public Criteria andBackSysUserNameLike(String value) {
            addCriterion("back_sys_user_name like", value, "backSysUserName");
            return (Criteria) this;
        }

        public Criteria andBackSysUserNameNotLike(String value) {
            addCriterion("back_sys_user_name not like", value, "backSysUserName");
            return (Criteria) this;
        }

        public Criteria andBackSysUserNameIn(List<String> values) {
            addCriterion("back_sys_user_name in", values, "backSysUserName");
            return (Criteria) this;
        }

        public Criteria andBackSysUserNameNotIn(List<String> values) {
            addCriterion("back_sys_user_name not in", values, "backSysUserName");
            return (Criteria) this;
        }

        public Criteria andBackSysUserNameBetween(String value1, String value2) {
            addCriterion("back_sys_user_name between", value1, value2, "backSysUserName");
            return (Criteria) this;
        }

        public Criteria andBackSysUserNameNotBetween(String value1, String value2) {
            addCriterion("back_sys_user_name not between", value1, value2, "backSysUserName");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andBetLoginIpIsNull() {
            addCriterion("bet_login_ip is null");
            return (Criteria) this;
        }

        public Criteria andBetLoginIpIsNotNull() {
            addCriterion("bet_login_ip is not null");
            return (Criteria) this;
        }

        public Criteria andBetLoginIpEqualTo(String value) {
            addCriterion("bet_login_ip =", value, "betLoginIp");
            return (Criteria) this;
        }

        public Criteria andBetLoginIpNotEqualTo(String value) {
            addCriterion("bet_login_ip <>", value, "betLoginIp");
            return (Criteria) this;
        }

        public Criteria andBetLoginIpGreaterThan(String value) {
            addCriterion("bet_login_ip >", value, "betLoginIp");
            return (Criteria) this;
        }

        public Criteria andBetLoginIpGreaterThanOrEqualTo(String value) {
            addCriterion("bet_login_ip >=", value, "betLoginIp");
            return (Criteria) this;
        }

        public Criteria andBetLoginIpLessThan(String value) {
            addCriterion("bet_login_ip <", value, "betLoginIp");
            return (Criteria) this;
        }

        public Criteria andBetLoginIpLessThanOrEqualTo(String value) {
            addCriterion("bet_login_ip <=", value, "betLoginIp");
            return (Criteria) this;
        }

        public Criteria andBetLoginIpLike(String value) {
            addCriterion("bet_login_ip like", value, "betLoginIp");
            return (Criteria) this;
        }

        public Criteria andBetLoginIpNotLike(String value) {
            addCriterion("bet_login_ip not like", value, "betLoginIp");
            return (Criteria) this;
        }

        public Criteria andBetLoginIpIn(List<String> values) {
            addCriterion("bet_login_ip in", values, "betLoginIp");
            return (Criteria) this;
        }

        public Criteria andBetLoginIpNotIn(List<String> values) {
            addCriterion("bet_login_ip not in", values, "betLoginIp");
            return (Criteria) this;
        }

        public Criteria andBetLoginIpBetween(String value1, String value2) {
            addCriterion("bet_login_ip between", value1, value2, "betLoginIp");
            return (Criteria) this;
        }

        public Criteria andBetLoginIpNotBetween(String value1, String value2) {
            addCriterion("bet_login_ip not between", value1, value2, "betLoginIp");
            return (Criteria) this;
        }

        public Criteria andBetUserAgentIsNull() {
            addCriterion("bet_user_agent is null");
            return (Criteria) this;
        }

        public Criteria andBetUserAgentIsNotNull() {
            addCriterion("bet_user_agent is not null");
            return (Criteria) this;
        }

        public Criteria andBetUserAgentEqualTo(String value) {
            addCriterion("bet_user_agent =", value, "betUserAgent");
            return (Criteria) this;
        }

        public Criteria andBetUserAgentNotEqualTo(String value) {
            addCriterion("bet_user_agent <>", value, "betUserAgent");
            return (Criteria) this;
        }

        public Criteria andBetUserAgentGreaterThan(String value) {
            addCriterion("bet_user_agent >", value, "betUserAgent");
            return (Criteria) this;
        }

        public Criteria andBetUserAgentGreaterThanOrEqualTo(String value) {
            addCriterion("bet_user_agent >=", value, "betUserAgent");
            return (Criteria) this;
        }

        public Criteria andBetUserAgentLessThan(String value) {
            addCriterion("bet_user_agent <", value, "betUserAgent");
            return (Criteria) this;
        }

        public Criteria andBetUserAgentLessThanOrEqualTo(String value) {
            addCriterion("bet_user_agent <=", value, "betUserAgent");
            return (Criteria) this;
        }

        public Criteria andBetUserAgentLike(String value) {
            addCriterion("bet_user_agent like", value, "betUserAgent");
            return (Criteria) this;
        }

        public Criteria andBetUserAgentNotLike(String value) {
            addCriterion("bet_user_agent not like", value, "betUserAgent");
            return (Criteria) this;
        }

        public Criteria andBetUserAgentIn(List<String> values) {
            addCriterion("bet_user_agent in", values, "betUserAgent");
            return (Criteria) this;
        }

        public Criteria andBetUserAgentNotIn(List<String> values) {
            addCriterion("bet_user_agent not in", values, "betUserAgent");
            return (Criteria) this;
        }

        public Criteria andBetUserAgentBetween(String value1, String value2) {
            addCriterion("bet_user_agent between", value1, value2, "betUserAgent");
            return (Criteria) this;
        }

        public Criteria andBetUserAgentNotBetween(String value1, String value2) {
            addCriterion("bet_user_agent not between", value1, value2, "betUserAgent");
            return (Criteria) this;
        }

        public Criteria andSyncFlagIsNull() {
            addCriterion("sync_flag is null");
            return (Criteria) this;
        }

        public Criteria andSyncFlagIsNotNull() {
            addCriterion("sync_flag is not null");
            return (Criteria) this;
        }

        public Criteria andSyncFlagEqualTo(Integer value) {
            addCriterion("sync_flag =", value, "syncFlag");
            return (Criteria) this;
        }

        public Criteria andSyncFlagNotEqualTo(Integer value) {
            addCriterion("sync_flag <>", value, "syncFlag");
            return (Criteria) this;
        }

        public Criteria andSyncFlagGreaterThan(Integer value) {
            addCriterion("sync_flag >", value, "syncFlag");
            return (Criteria) this;
        }

        public Criteria andSyncFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("sync_flag >=", value, "syncFlag");
            return (Criteria) this;
        }

        public Criteria andSyncFlagLessThan(Integer value) {
            addCriterion("sync_flag <", value, "syncFlag");
            return (Criteria) this;
        }

        public Criteria andSyncFlagLessThanOrEqualTo(Integer value) {
            addCriterion("sync_flag <=", value, "syncFlag");
            return (Criteria) this;
        }

        public Criteria andSyncFlagIn(List<Integer> values) {
            addCriterion("sync_flag in", values, "syncFlag");
            return (Criteria) this;
        }

        public Criteria andSyncFlagNotIn(List<Integer> values) {
            addCriterion("sync_flag not in", values, "syncFlag");
            return (Criteria) this;
        }

        public Criteria andSyncFlagBetween(Integer value1, Integer value2) {
            addCriterion("sync_flag between", value1, value2, "syncFlag");
            return (Criteria) this;
        }

        public Criteria andSyncFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("sync_flag not between", value1, value2, "syncFlag");
            return (Criteria) this;
        }

        public Criteria andBetSettledIsNull() {
            addCriterion("bet_settled is null");
            return (Criteria) this;
        }

        public Criteria andBetSettledIsNotNull() {
            addCriterion("bet_settled is not null");
            return (Criteria) this;
        }

        public Criteria andBetSettledEqualTo(Date value) {
            addCriterion("bet_settled =", value, "betSettled");
            return (Criteria) this;
        }

        public Criteria andBetSettledNotEqualTo(Date value) {
            addCriterion("bet_settled <>", value, "betSettled");
            return (Criteria) this;
        }

        public Criteria andBetSettledGreaterThan(Date value) {
            addCriterion("bet_settled >", value, "betSettled");
            return (Criteria) this;
        }

        public Criteria andBetSettledGreaterThanOrEqualTo(Date value) {
            addCriterion("bet_settled >=", value, "betSettled");
            return (Criteria) this;
        }

        public Criteria andBetSettledLessThan(Date value) {
            addCriterion("bet_settled <", value, "betSettled");
            return (Criteria) this;
        }

        public Criteria andBetSettledLessThanOrEqualTo(Date value) {
            addCriterion("bet_settled <=", value, "betSettled");
            return (Criteria) this;
        }

        public Criteria andBetSettledIn(List<Date> values) {
            addCriterion("bet_settled in", values, "betSettled");
            return (Criteria) this;
        }

        public Criteria andBetSettledNotIn(List<Date> values) {
            addCriterion("bet_settled not in", values, "betSettled");
            return (Criteria) this;
        }

        public Criteria andBetSettledBetween(Date value1, Date value2) {
            addCriterion("bet_settled between", value1, value2, "betSettled");
            return (Criteria) this;
        }

        public Criteria andBetSettledNotBetween(Date value1, Date value2) {
            addCriterion("bet_settled not between", value1, value2, "betSettled");
            return (Criteria) this;
        }

        public Criteria andBetDeviceIsNull() {
            addCriterion("bet_device is null");
            return (Criteria) this;
        }

        public Criteria andBetDeviceIsNotNull() {
            addCriterion("bet_device is not null");
            return (Criteria) this;
        }

        public Criteria andBetDeviceEqualTo(String value) {
            addCriterion("bet_device =", value, "betDevice");
            return (Criteria) this;
        }

        public Criteria andBetDeviceNotEqualTo(String value) {
            addCriterion("bet_device <>", value, "betDevice");
            return (Criteria) this;
        }

        public Criteria andBetDeviceGreaterThan(String value) {
            addCriterion("bet_device >", value, "betDevice");
            return (Criteria) this;
        }

        public Criteria andBetDeviceGreaterThanOrEqualTo(String value) {
            addCriterion("bet_device >=", value, "betDevice");
            return (Criteria) this;
        }

        public Criteria andBetDeviceLessThan(String value) {
            addCriterion("bet_device <", value, "betDevice");
            return (Criteria) this;
        }

        public Criteria andBetDeviceLessThanOrEqualTo(String value) {
            addCriterion("bet_device <=", value, "betDevice");
            return (Criteria) this;
        }

        public Criteria andBetDeviceLike(String value) {
            addCriterion("bet_device like", value, "betDevice");
            return (Criteria) this;
        }

        public Criteria andBetDeviceNotLike(String value) {
            addCriterion("bet_device not like", value, "betDevice");
            return (Criteria) this;
        }

        public Criteria andBetDeviceIn(List<String> values) {
            addCriterion("bet_device in", values, "betDevice");
            return (Criteria) this;
        }

        public Criteria andBetDeviceNotIn(List<String> values) {
            addCriterion("bet_device not in", values, "betDevice");
            return (Criteria) this;
        }

        public Criteria andBetDeviceBetween(String value1, String value2) {
            addCriterion("bet_device between", value1, value2, "betDevice");
            return (Criteria) this;
        }

        public Criteria andBetDeviceNotBetween(String value1, String value2) {
            addCriterion("bet_device not between", value1, value2, "betDevice");
            return (Criteria) this;
        }

        public Criteria andIsWaterIsNull() {
            addCriterion("is_water is null");
            return (Criteria) this;
        }

        public Criteria andIsWaterIsNotNull() {
            addCriterion("is_water is not null");
            return (Criteria) this;
        }

        public Criteria andIsWaterEqualTo(Integer value) {
            addCriterion("is_water =", value, "isWater");
            return (Criteria) this;
        }

        public Criteria andIsWaterNotEqualTo(Integer value) {
            addCriterion("is_water <>", value, "isWater");
            return (Criteria) this;
        }

        public Criteria andIsWaterGreaterThan(Integer value) {
            addCriterion("is_water >", value, "isWater");
            return (Criteria) this;
        }

        public Criteria andIsWaterGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_water >=", value, "isWater");
            return (Criteria) this;
        }

        public Criteria andIsWaterLessThan(Integer value) {
            addCriterion("is_water <", value, "isWater");
            return (Criteria) this;
        }

        public Criteria andIsWaterLessThanOrEqualTo(Integer value) {
            addCriterion("is_water <=", value, "isWater");
            return (Criteria) this;
        }

        public Criteria andIsWaterIn(List<Integer> values) {
            addCriterion("is_water in", values, "isWater");
            return (Criteria) this;
        }

        public Criteria andIsWaterNotIn(List<Integer> values) {
            addCriterion("is_water not in", values, "isWater");
            return (Criteria) this;
        }

        public Criteria andIsWaterBetween(Integer value1, Integer value2) {
            addCriterion("is_water between", value1, value2, "isWater");
            return (Criteria) this;
        }

        public Criteria andIsWaterNotBetween(Integer value1, Integer value2) {
            addCriterion("is_water not between", value1, value2, "isWater");
            return (Criteria) this;
        }

        public Criteria andBetGameTypeIsNull() {
            addCriterion("bet_game_type is null");
            return (Criteria) this;
        }

        public Criteria andBetGameTypeIsNotNull() {
            addCriterion("bet_game_type is not null");
            return (Criteria) this;
        }

        public Criteria andBetGameTypeEqualTo(String value) {
            addCriterion("bet_game_type =", value, "betGameType");
            return (Criteria) this;
        }

        public Criteria andBetGameTypeNotEqualTo(String value) {
            addCriterion("bet_game_type <>", value, "betGameType");
            return (Criteria) this;
        }

        public Criteria andBetGameTypeGreaterThan(String value) {
            addCriterion("bet_game_type >", value, "betGameType");
            return (Criteria) this;
        }

        public Criteria andBetGameTypeGreaterThanOrEqualTo(String value) {
            addCriterion("bet_game_type >=", value, "betGameType");
            return (Criteria) this;
        }

        public Criteria andBetGameTypeLessThan(String value) {
            addCriterion("bet_game_type <", value, "betGameType");
            return (Criteria) this;
        }

        public Criteria andBetGameTypeLessThanOrEqualTo(String value) {
            addCriterion("bet_game_type <=", value, "betGameType");
            return (Criteria) this;
        }

        public Criteria andBetGameTypeLike(String value) {
            addCriterion("bet_game_type like", value, "betGameType");
            return (Criteria) this;
        }

        public Criteria andBetGameTypeNotLike(String value) {
            addCriterion("bet_game_type not like", value, "betGameType");
            return (Criteria) this;
        }

        public Criteria andBetGameTypeIn(List<String> values) {
            addCriterion("bet_game_type in", values, "betGameType");
            return (Criteria) this;
        }

        public Criteria andBetGameTypeNotIn(List<String> values) {
            addCriterion("bet_game_type not in", values, "betGameType");
            return (Criteria) this;
        }

        public Criteria andBetGameTypeBetween(String value1, String value2) {
            addCriterion("bet_game_type between", value1, value2, "betGameType");
            return (Criteria) this;
        }

        public Criteria andBetGameTypeNotBetween(String value1, String value2) {
            addCriterion("bet_game_type not between", value1, value2, "betGameType");
            return (Criteria) this;
        }

        public Criteria andSettleStatusIsNull() {
            addCriterion("settle_status is null");
            return (Criteria) this;
        }

        public Criteria andSettleStatusIsNotNull() {
            addCriterion("settle_status is not null");
            return (Criteria) this;
        }

        public Criteria andSettleStatusEqualTo(Integer value) {
            addCriterion("settle_status =", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusNotEqualTo(Integer value) {
            addCriterion("settle_status <>", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusGreaterThan(Integer value) {
            addCriterion("settle_status >", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("settle_status >=", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusLessThan(Integer value) {
            addCriterion("settle_status <", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusLessThanOrEqualTo(Integer value) {
            addCriterion("settle_status <=", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusIn(List<Integer> values) {
            addCriterion("settle_status in", values, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusNotIn(List<Integer> values) {
            addCriterion("settle_status not in", values, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusBetween(Integer value1, Integer value2) {
            addCriterion("settle_status between", value1, value2, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("settle_status not between", value1, value2, "settleStatus");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}