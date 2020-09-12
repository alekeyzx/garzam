class fibonacci
{
    public static void main(String args[])
    {
        int PrimerValor=0;
        int SegundoValor=1;
        int TercerValor=0;
        int x = 0;
        System.out.println(PrimerValor);
        System.out.println(SegundoValor);
        System.out.println("--------------");

        while (x<=20)
        {
            TercerValor = PrimerValor + SegundoValor;
            
            System.out.println(TercerValor);

            PrimerValor = SegundoValor;
            SegundoValor = TercerValor;

            x++;
        }

    }
}