public class DefinindoPrioridade {
    public static void main(String[] args) {
        InterfaceRun minhaTred = new InterfaceRun("Tarefa 1", 600);
        InterfaceRun minhaTre = new InterfaceRun("Tarefa 2", 100);

        Thread t1 = new Thread(minhaTre);
        Thread t2 = new Thread(minhaTred);

        t2.setPriority(Thread.MAX_PRIORITY); //max, min, normal
        t1.setPriority(1); // de 1 ate 10

        t1.start();
        t2.start();
    }
}
