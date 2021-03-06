package com.xzl.bookstore.pojo.po;

import java.util.ArrayList;
import java.util.List;

public class BookParamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookParamExample() {
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

        public Criteria andBookIdIsNull() {
            addCriterion("book_id is null");
            return (Criteria) this;
        }

        public Criteria andBookIdIsNotNull() {
            addCriterion("book_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookIdEqualTo(Integer value) {
            addCriterion("book_id =", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotEqualTo(Integer value) {
            addCriterion("book_id <>", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThan(Integer value) {
            addCriterion("book_id >", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("book_id >=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThan(Integer value) {
            addCriterion("book_id <", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdLessThanOrEqualTo(Integer value) {
            addCriterion("book_id <=", value, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdIn(List<Integer> values) {
            addCriterion("book_id in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotIn(List<Integer> values) {
            addCriterion("book_id not in", values, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdBetween(Integer value1, Integer value2) {
            addCriterion("book_id between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andBookIdNotBetween(Integer value1, Integer value2) {
            addCriterion("book_id not between", value1, value2, "bookId");
            return (Criteria) this;
        }

        public Criteria andCatalogIsNull() {
            addCriterion("catalog is null");
            return (Criteria) this;
        }

        public Criteria andCatalogIsNotNull() {
            addCriterion("catalog is not null");
            return (Criteria) this;
        }

        public Criteria andCatalogEqualTo(String value) {
            addCriterion("catalog =", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogNotEqualTo(String value) {
            addCriterion("catalog <>", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogGreaterThan(String value) {
            addCriterion("catalog >", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogGreaterThanOrEqualTo(String value) {
            addCriterion("catalog >=", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogLessThan(String value) {
            addCriterion("catalog <", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogLessThanOrEqualTo(String value) {
            addCriterion("catalog <=", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogLike(String value) {
            addCriterion("catalog like", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogNotLike(String value) {
            addCriterion("catalog not like", value, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogIn(List<String> values) {
            addCriterion("catalog in", values, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogNotIn(List<String> values) {
            addCriterion("catalog not in", values, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogBetween(String value1, String value2) {
            addCriterion("catalog between", value1, value2, "catalog");
            return (Criteria) this;
        }

        public Criteria andCatalogNotBetween(String value1, String value2) {
            addCriterion("catalog not between", value1, value2, "catalog");
            return (Criteria) this;
        }

        public Criteria andChapter1IsNull() {
            addCriterion("chapter1 is null");
            return (Criteria) this;
        }

        public Criteria andChapter1IsNotNull() {
            addCriterion("chapter1 is not null");
            return (Criteria) this;
        }

        public Criteria andChapter1EqualTo(String value) {
            addCriterion("chapter1 =", value, "chapter1");
            return (Criteria) this;
        }

        public Criteria andChapter1NotEqualTo(String value) {
            addCriterion("chapter1 <>", value, "chapter1");
            return (Criteria) this;
        }

        public Criteria andChapter1GreaterThan(String value) {
            addCriterion("chapter1 >", value, "chapter1");
            return (Criteria) this;
        }

        public Criteria andChapter1GreaterThanOrEqualTo(String value) {
            addCriterion("chapter1 >=", value, "chapter1");
            return (Criteria) this;
        }

        public Criteria andChapter1LessThan(String value) {
            addCriterion("chapter1 <", value, "chapter1");
            return (Criteria) this;
        }

        public Criteria andChapter1LessThanOrEqualTo(String value) {
            addCriterion("chapter1 <=", value, "chapter1");
            return (Criteria) this;
        }

        public Criteria andChapter1Like(String value) {
            addCriterion("chapter1 like", value, "chapter1");
            return (Criteria) this;
        }

        public Criteria andChapter1NotLike(String value) {
            addCriterion("chapter1 not like", value, "chapter1");
            return (Criteria) this;
        }

        public Criteria andChapter1In(List<String> values) {
            addCriterion("chapter1 in", values, "chapter1");
            return (Criteria) this;
        }

        public Criteria andChapter1NotIn(List<String> values) {
            addCriterion("chapter1 not in", values, "chapter1");
            return (Criteria) this;
        }

        public Criteria andChapter1Between(String value1, String value2) {
            addCriterion("chapter1 between", value1, value2, "chapter1");
            return (Criteria) this;
        }

        public Criteria andChapter1NotBetween(String value1, String value2) {
            addCriterion("chapter1 not between", value1, value2, "chapter1");
            return (Criteria) this;
        }

        public Criteria andChapter2IsNull() {
            addCriterion("chapter2 is null");
            return (Criteria) this;
        }

        public Criteria andChapter2IsNotNull() {
            addCriterion("chapter2 is not null");
            return (Criteria) this;
        }

        public Criteria andChapter2EqualTo(String value) {
            addCriterion("chapter2 =", value, "chapter2");
            return (Criteria) this;
        }

        public Criteria andChapter2NotEqualTo(String value) {
            addCriterion("chapter2 <>", value, "chapter2");
            return (Criteria) this;
        }

        public Criteria andChapter2GreaterThan(String value) {
            addCriterion("chapter2 >", value, "chapter2");
            return (Criteria) this;
        }

        public Criteria andChapter2GreaterThanOrEqualTo(String value) {
            addCriterion("chapter2 >=", value, "chapter2");
            return (Criteria) this;
        }

        public Criteria andChapter2LessThan(String value) {
            addCriterion("chapter2 <", value, "chapter2");
            return (Criteria) this;
        }

        public Criteria andChapter2LessThanOrEqualTo(String value) {
            addCriterion("chapter2 <=", value, "chapter2");
            return (Criteria) this;
        }

        public Criteria andChapter2Like(String value) {
            addCriterion("chapter2 like", value, "chapter2");
            return (Criteria) this;
        }

        public Criteria andChapter2NotLike(String value) {
            addCriterion("chapter2 not like", value, "chapter2");
            return (Criteria) this;
        }

        public Criteria andChapter2In(List<String> values) {
            addCriterion("chapter2 in", values, "chapter2");
            return (Criteria) this;
        }

        public Criteria andChapter2NotIn(List<String> values) {
            addCriterion("chapter2 not in", values, "chapter2");
            return (Criteria) this;
        }

        public Criteria andChapter2Between(String value1, String value2) {
            addCriterion("chapter2 between", value1, value2, "chapter2");
            return (Criteria) this;
        }

        public Criteria andChapter2NotBetween(String value1, String value2) {
            addCriterion("chapter2 not between", value1, value2, "chapter2");
            return (Criteria) this;
        }

        public Criteria andChapter3IsNull() {
            addCriterion("chapter3 is null");
            return (Criteria) this;
        }

        public Criteria andChapter3IsNotNull() {
            addCriterion("chapter3 is not null");
            return (Criteria) this;
        }

        public Criteria andChapter3EqualTo(String value) {
            addCriterion("chapter3 =", value, "chapter3");
            return (Criteria) this;
        }

        public Criteria andChapter3NotEqualTo(String value) {
            addCriterion("chapter3 <>", value, "chapter3");
            return (Criteria) this;
        }

        public Criteria andChapter3GreaterThan(String value) {
            addCriterion("chapter3 >", value, "chapter3");
            return (Criteria) this;
        }

        public Criteria andChapter3GreaterThanOrEqualTo(String value) {
            addCriterion("chapter3 >=", value, "chapter3");
            return (Criteria) this;
        }

        public Criteria andChapter3LessThan(String value) {
            addCriterion("chapter3 <", value, "chapter3");
            return (Criteria) this;
        }

        public Criteria andChapter3LessThanOrEqualTo(String value) {
            addCriterion("chapter3 <=", value, "chapter3");
            return (Criteria) this;
        }

        public Criteria andChapter3Like(String value) {
            addCriterion("chapter3 like", value, "chapter3");
            return (Criteria) this;
        }

        public Criteria andChapter3NotLike(String value) {
            addCriterion("chapter3 not like", value, "chapter3");
            return (Criteria) this;
        }

        public Criteria andChapter3In(List<String> values) {
            addCriterion("chapter3 in", values, "chapter3");
            return (Criteria) this;
        }

        public Criteria andChapter3NotIn(List<String> values) {
            addCriterion("chapter3 not in", values, "chapter3");
            return (Criteria) this;
        }

        public Criteria andChapter3Between(String value1, String value2) {
            addCriterion("chapter3 between", value1, value2, "chapter3");
            return (Criteria) this;
        }

        public Criteria andChapter3NotBetween(String value1, String value2) {
            addCriterion("chapter3 not between", value1, value2, "chapter3");
            return (Criteria) this;
        }

        public Criteria andBookPageIsNull() {
            addCriterion("book_page is null");
            return (Criteria) this;
        }

        public Criteria andBookPageIsNotNull() {
            addCriterion("book_page is not null");
            return (Criteria) this;
        }

        public Criteria andBookPageEqualTo(String value) {
            addCriterion("book_page =", value, "bookPage");
            return (Criteria) this;
        }

        public Criteria andBookPageNotEqualTo(String value) {
            addCriterion("book_page <>", value, "bookPage");
            return (Criteria) this;
        }

        public Criteria andBookPageGreaterThan(String value) {
            addCriterion("book_page >", value, "bookPage");
            return (Criteria) this;
        }

        public Criteria andBookPageGreaterThanOrEqualTo(String value) {
            addCriterion("book_page >=", value, "bookPage");
            return (Criteria) this;
        }

        public Criteria andBookPageLessThan(String value) {
            addCriterion("book_page <", value, "bookPage");
            return (Criteria) this;
        }

        public Criteria andBookPageLessThanOrEqualTo(String value) {
            addCriterion("book_page <=", value, "bookPage");
            return (Criteria) this;
        }

        public Criteria andBookPageLike(String value) {
            addCriterion("book_page like", value, "bookPage");
            return (Criteria) this;
        }

        public Criteria andBookPageNotLike(String value) {
            addCriterion("book_page not like", value, "bookPage");
            return (Criteria) this;
        }

        public Criteria andBookPageIn(List<String> values) {
            addCriterion("book_page in", values, "bookPage");
            return (Criteria) this;
        }

        public Criteria andBookPageNotIn(List<String> values) {
            addCriterion("book_page not in", values, "bookPage");
            return (Criteria) this;
        }

        public Criteria andBookPageBetween(String value1, String value2) {
            addCriterion("book_page between", value1, value2, "bookPage");
            return (Criteria) this;
        }

        public Criteria andBookPageNotBetween(String value1, String value2) {
            addCriterion("book_page not between", value1, value2, "bookPage");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("size is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("size is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(String value) {
            addCriterion("size =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(String value) {
            addCriterion("size <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(String value) {
            addCriterion("size >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(String value) {
            addCriterion("size >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(String value) {
            addCriterion("size <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(String value) {
            addCriterion("size <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLike(String value) {
            addCriterion("size like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotLike(String value) {
            addCriterion("size not like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<String> values) {
            addCriterion("size in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<String> values) {
            addCriterion("size not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(String value1, String value2) {
            addCriterion("size between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(String value1, String value2) {
            addCriterion("size not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andIsbnIsNull() {
            addCriterion("isbn is null");
            return (Criteria) this;
        }

        public Criteria andIsbnIsNotNull() {
            addCriterion("isbn is not null");
            return (Criteria) this;
        }

        public Criteria andIsbnEqualTo(String value) {
            addCriterion("isbn =", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotEqualTo(String value) {
            addCriterion("isbn <>", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnGreaterThan(String value) {
            addCriterion("isbn >", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnGreaterThanOrEqualTo(String value) {
            addCriterion("isbn >=", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLessThan(String value) {
            addCriterion("isbn <", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLessThanOrEqualTo(String value) {
            addCriterion("isbn <=", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnLike(String value) {
            addCriterion("isbn like", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotLike(String value) {
            addCriterion("isbn not like", value, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnIn(List<String> values) {
            addCriterion("isbn in", values, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotIn(List<String> values) {
            addCriterion("isbn not in", values, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnBetween(String value1, String value2) {
            addCriterion("isbn between", value1, value2, "isbn");
            return (Criteria) this;
        }

        public Criteria andIsbnNotBetween(String value1, String value2) {
            addCriterion("isbn not between", value1, value2, "isbn");
            return (Criteria) this;
        }

        public Criteria andBookEditionIsNull() {
            addCriterion("book_edition is null");
            return (Criteria) this;
        }

        public Criteria andBookEditionIsNotNull() {
            addCriterion("book_edition is not null");
            return (Criteria) this;
        }

        public Criteria andBookEditionEqualTo(String value) {
            addCriterion("book_edition =", value, "bookEdition");
            return (Criteria) this;
        }

        public Criteria andBookEditionNotEqualTo(String value) {
            addCriterion("book_edition <>", value, "bookEdition");
            return (Criteria) this;
        }

        public Criteria andBookEditionGreaterThan(String value) {
            addCriterion("book_edition >", value, "bookEdition");
            return (Criteria) this;
        }

        public Criteria andBookEditionGreaterThanOrEqualTo(String value) {
            addCriterion("book_edition >=", value, "bookEdition");
            return (Criteria) this;
        }

        public Criteria andBookEditionLessThan(String value) {
            addCriterion("book_edition <", value, "bookEdition");
            return (Criteria) this;
        }

        public Criteria andBookEditionLessThanOrEqualTo(String value) {
            addCriterion("book_edition <=", value, "bookEdition");
            return (Criteria) this;
        }

        public Criteria andBookEditionLike(String value) {
            addCriterion("book_edition like", value, "bookEdition");
            return (Criteria) this;
        }

        public Criteria andBookEditionNotLike(String value) {
            addCriterion("book_edition not like", value, "bookEdition");
            return (Criteria) this;
        }

        public Criteria andBookEditionIn(List<String> values) {
            addCriterion("book_edition in", values, "bookEdition");
            return (Criteria) this;
        }

        public Criteria andBookEditionNotIn(List<String> values) {
            addCriterion("book_edition not in", values, "bookEdition");
            return (Criteria) this;
        }

        public Criteria andBookEditionBetween(String value1, String value2) {
            addCriterion("book_edition between", value1, value2, "bookEdition");
            return (Criteria) this;
        }

        public Criteria andBookEditionNotBetween(String value1, String value2) {
            addCriterion("book_edition not between", value1, value2, "bookEdition");
            return (Criteria) this;
        }

        public Criteria andBookWordsIsNull() {
            addCriterion("book_words is null");
            return (Criteria) this;
        }

        public Criteria andBookWordsIsNotNull() {
            addCriterion("book_words is not null");
            return (Criteria) this;
        }

        public Criteria andBookWordsEqualTo(String value) {
            addCriterion("book_words =", value, "bookWords");
            return (Criteria) this;
        }

        public Criteria andBookWordsNotEqualTo(String value) {
            addCriterion("book_words <>", value, "bookWords");
            return (Criteria) this;
        }

        public Criteria andBookWordsGreaterThan(String value) {
            addCriterion("book_words >", value, "bookWords");
            return (Criteria) this;
        }

        public Criteria andBookWordsGreaterThanOrEqualTo(String value) {
            addCriterion("book_words >=", value, "bookWords");
            return (Criteria) this;
        }

        public Criteria andBookWordsLessThan(String value) {
            addCriterion("book_words <", value, "bookWords");
            return (Criteria) this;
        }

        public Criteria andBookWordsLessThanOrEqualTo(String value) {
            addCriterion("book_words <=", value, "bookWords");
            return (Criteria) this;
        }

        public Criteria andBookWordsLike(String value) {
            addCriterion("book_words like", value, "bookWords");
            return (Criteria) this;
        }

        public Criteria andBookWordsNotLike(String value) {
            addCriterion("book_words not like", value, "bookWords");
            return (Criteria) this;
        }

        public Criteria andBookWordsIn(List<String> values) {
            addCriterion("book_words in", values, "bookWords");
            return (Criteria) this;
        }

        public Criteria andBookWordsNotIn(List<String> values) {
            addCriterion("book_words not in", values, "bookWords");
            return (Criteria) this;
        }

        public Criteria andBookWordsBetween(String value1, String value2) {
            addCriterion("book_words between", value1, value2, "bookWords");
            return (Criteria) this;
        }

        public Criteria andBookWordsNotBetween(String value1, String value2) {
            addCriterion("book_words not between", value1, value2, "bookWords");
            return (Criteria) this;
        }

        public Criteria andBookPackIsNull() {
            addCriterion("book_pack is null");
            return (Criteria) this;
        }

        public Criteria andBookPackIsNotNull() {
            addCriterion("book_pack is not null");
            return (Criteria) this;
        }

        public Criteria andBookPackEqualTo(String value) {
            addCriterion("book_pack =", value, "bookPack");
            return (Criteria) this;
        }

        public Criteria andBookPackNotEqualTo(String value) {
            addCriterion("book_pack <>", value, "bookPack");
            return (Criteria) this;
        }

        public Criteria andBookPackGreaterThan(String value) {
            addCriterion("book_pack >", value, "bookPack");
            return (Criteria) this;
        }

        public Criteria andBookPackGreaterThanOrEqualTo(String value) {
            addCriterion("book_pack >=", value, "bookPack");
            return (Criteria) this;
        }

        public Criteria andBookPackLessThan(String value) {
            addCriterion("book_pack <", value, "bookPack");
            return (Criteria) this;
        }

        public Criteria andBookPackLessThanOrEqualTo(String value) {
            addCriterion("book_pack <=", value, "bookPack");
            return (Criteria) this;
        }

        public Criteria andBookPackLike(String value) {
            addCriterion("book_pack like", value, "bookPack");
            return (Criteria) this;
        }

        public Criteria andBookPackNotLike(String value) {
            addCriterion("book_pack not like", value, "bookPack");
            return (Criteria) this;
        }

        public Criteria andBookPackIn(List<String> values) {
            addCriterion("book_pack in", values, "bookPack");
            return (Criteria) this;
        }

        public Criteria andBookPackNotIn(List<String> values) {
            addCriterion("book_pack not in", values, "bookPack");
            return (Criteria) this;
        }

        public Criteria andBookPackBetween(String value1, String value2) {
            addCriterion("book_pack between", value1, value2, "bookPack");
            return (Criteria) this;
        }

        public Criteria andBookPackNotBetween(String value1, String value2) {
            addCriterion("book_pack not between", value1, value2, "bookPack");
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