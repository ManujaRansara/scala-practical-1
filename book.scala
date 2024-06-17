object book{
     def main(args: Array[String]): Unit = {
        var cover_prize=24.95;
        var discount_percentage=40/100;
        var discount = cover_prize*discount_percentage;
        var get_price = cover_prize - discount;
        var total=get_price*60;
        var shipping_cost = 3*50 + 0.75*10;
        var total_price = total + shipping_cost;
        println("Total cost is "+ total_price);

     }
}