public class Mensal {
    public static void main(String[] args) {
        double SP=67836.43, RJ=36678.66, MG=29229.88, ES=27165.48, OUTROS=19849.53,total=SP+RJ+MG+ES+OUTROS;

        double pSP=SP*100/total,pRJ=RJ*100/total,pMG=MG*100/total,pES=ES*100/total,pOUTROS=OUTROS*100/total;

        System.out.println(total);
        System.out.println("Porcentagem de SP: "+pSP);
        System.out.println("Porcentagem de RJ: "+pRJ);
        System.out.println("Porcentagem de MG: "+pMG);
        System.out.println("Porcentagem de ES: "+pES);
        System.out.println("Porcentagem de OUTROS: "+pOUTROS);


    }
}
