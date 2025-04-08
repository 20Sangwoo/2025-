package day12.question.q13;

public class ItemSales {
  private int numberSold, sales, itemCost,
          bulkMin, soldCount;
  private double discounts,bulkDiscount;

  public ItemSales(int itemCost, int bulkMin, double bulkDiscount) {
    this.itemCost = itemCost;
    this.bulkMin = bulkMin;
    this.bulkDiscount = bulkDiscount;
    this.numberSold = 0;
    this.sales = 0;
    this.discounts = 0;
    this.soldCount = 0;
  }

  public int getNumberSold() {
    return numberSold;
  }

  public int getSales() {
    return sales;
  }

  public double getDiscounts() {
    return discounts;
  }

  public int getBulkMin() {
    return bulkMin;
  }

  public double getBulkDiscount() {
    return bulkDiscount;
  }

  public int getsoldCount() {
    return soldCount;
  }

  public void setNumberSold(int numberSold) {
    this.numberSold = numberSold;
  }

  public void setSales(int sales) {
    this.sales = sales;
  }

  public void setDiscounts(double discounts) {
    this.discounts = discounts;
  }

  public void setBulkMin(int bulkMin) {
    this.bulkMin = bulkMin;
  }

  public void setBulkDiscount(double bulkDiscount) {
    this.bulkDiscount = bulkDiscount;
  }

  public void displaySales() {
    System.out.printf("누적 판매량 : %d, 누적 판매금액 : %d, 누적 할인금액 : %.1f\n",
            getNumberSold(), getSales(), getDiscounts());
  }

  public void registerSale(int n) {
//    기본 금액 = 판매 수량 * 물품 가격
    int basicCost = n * this.itemCost;
//    할인율 기본 0.0
    double discountGiven = 0.0;

//    판매 수량 증가
//    대량 판매 할인율 확인 (판매량이 대량 판매 기준에 미치는지)
    numberSold += n;
    soldCount = n;
    if (this.numberSold >= this.bulkMin) {
//      할인 금액 = 기본 금액 * 대량 할인율
      discountGiven = basicCost * this.bulkDiscount;
    }

//    총 판매 금액에 할인 금액 제외한 기본 금액 누적
//    누적 할인 금액에 할인 금액 누적
    this.sales += (basicCost - (int)discountGiven);
    this.discounts += discountGiven;
  }
}
