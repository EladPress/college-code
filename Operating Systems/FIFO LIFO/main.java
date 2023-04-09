class Main
{
    public static void main(String[] args)
    {
        Paging alg = new Paging();
        int ch = 0;
        int ws;

        while (true)
        {
            System.out.println("-------------------------");
            System.out.println("1.FIFO");
            System.out.println("2.LIFO");
            System.out.println("3.LRU");
            System.out.println("4.LFU");
            System.out.println("5.EXIT");
            System.out.println("-------------------------");

            ch = Utils.getNum("Enter your choice: ");

            if (ch == 5)
                break;

            ws = Utils.getNum("Enter W.S: ");
            int[] pages = Utils.getReferenceString();

            switch (ch)
            {
                case 1:
                    alg.fifo(ws, pages);
                    break;
                case 2:
                    alg.lifo(ws, pages);
                    break;
                case 3:
                    //alg.lru(ws);
                    break;
                case 4:
                    //alg.lfu(ws);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Wrong option");
            }
        }
    }
}