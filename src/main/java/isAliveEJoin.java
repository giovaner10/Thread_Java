public class isAliveEJoin {
    public static void main(String[] args) {
        InterfaceRun minhaTred = new InterfaceRun("Tarefa 1", 600);
        InterfaceRun minhaTre = new InterfaceRun("Tarefa 2", 100);

        Thread t1 = new Thread(minhaTre);
        Thread t2 = new Thread(minhaTred);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Processo finalizado");
    }
}
