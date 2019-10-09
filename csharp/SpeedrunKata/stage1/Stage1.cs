namespace SpeedrunKata.stage1
{
    /**
     * Uncomment the tests, and make them pass
     */
    public class Stage1
    {
        public class Items
        {
            public static Items POTATO = new Items(1);
            public static Items TOMATO = new Items(2);
            public static Items LETTUCE = new Items(2);
            public static Items APPLE = new Items(1);
            public static Items BANANA = new Items(3);
            public static Items PEER = new Items(2);

            private readonly int price;
            public Items(int price)
            {
                this.price = price;
            }

            public int GetPrice()
            {
                return this.price;
            }
        }
    }
}
