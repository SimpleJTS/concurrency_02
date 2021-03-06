package top.jimmyweb.concurrency02.dataobject;

import java.math.BigDecimal;
import java.util.Date;

public class MiaoshaGoods {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miaosha_goods.id
     *
     * @mbg.generated Sat Jul 20 15:28:31 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miaosha_goods.goods_id
     *
     * @mbg.generated Sat Jul 20 15:28:31 CST 2019
     */
    private Long goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miaosha_goods.miaosha_price
     *
     * @mbg.generated Sat Jul 20 15:28:31 CST 2019
     */
    private BigDecimal miaoshaPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miaosha_goods.stock_count
     *
     * @mbg.generated Sat Jul 20 15:28:31 CST 2019
     */
    private Integer stockCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miaosha_goods.start_date
     *
     * @mbg.generated Sat Jul 20 15:28:31 CST 2019
     */
    private Date startDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miaosha_goods.end_date
     *
     * @mbg.generated Sat Jul 20 15:28:31 CST 2019
     */
    private Date endDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miaosha_goods.id
     *
     * @return the value of miaosha_goods.id
     *
     * @mbg.generated Sat Jul 20 15:28:31 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miaosha_goods.id
     *
     * @param id the value for miaosha_goods.id
     *
     * @mbg.generated Sat Jul 20 15:28:31 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miaosha_goods.goods_id
     *
     * @return the value of miaosha_goods.goods_id
     *
     * @mbg.generated Sat Jul 20 15:28:31 CST 2019
     */
    public Long getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miaosha_goods.goods_id
     *
     * @param goodsId the value for miaosha_goods.goods_id
     *
     * @mbg.generated Sat Jul 20 15:28:31 CST 2019
     */
    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miaosha_goods.miaosha_price
     *
     * @return the value of miaosha_goods.miaosha_price
     *
     * @mbg.generated Sat Jul 20 15:28:31 CST 2019
     */
    public BigDecimal getMiaoshaPrice() {
        return miaoshaPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miaosha_goods.miaosha_price
     *
     * @param miaoshaPrice the value for miaosha_goods.miaosha_price
     *
     * @mbg.generated Sat Jul 20 15:28:31 CST 2019
     */
    public void setMiaoshaPrice(BigDecimal miaoshaPrice) {
        this.miaoshaPrice = miaoshaPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miaosha_goods.stock_count
     *
     * @return the value of miaosha_goods.stock_count
     *
     * @mbg.generated Sat Jul 20 15:28:31 CST 2019
     */
    public Integer getStockCount() {
        return stockCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miaosha_goods.stock_count
     *
     * @param stockCount the value for miaosha_goods.stock_count
     *
     * @mbg.generated Sat Jul 20 15:28:31 CST 2019
     */
    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miaosha_goods.start_date
     *
     * @return the value of miaosha_goods.start_date
     *
     * @mbg.generated Sat Jul 20 15:28:31 CST 2019
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miaosha_goods.start_date
     *
     * @param startDate the value for miaosha_goods.start_date
     *
     * @mbg.generated Sat Jul 20 15:28:31 CST 2019
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miaosha_goods.end_date
     *
     * @return the value of miaosha_goods.end_date
     *
     * @mbg.generated Sat Jul 20 15:28:31 CST 2019
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miaosha_goods.end_date
     *
     * @param endDate the value for miaosha_goods.end_date
     *
     * @mbg.generated Sat Jul 20 15:28:31 CST 2019
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}