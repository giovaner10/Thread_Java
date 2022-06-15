public class InterfaceRun implements Runnable{
    private String nome;
    private int tempo;

    public InterfaceRun(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {


        try {
            int i = 0;
            while (i != 5) {
                System.out.println(nome + " -- Iniciando processo");
                Thread.sleep(this.tempo);
                i++;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(nome + " - Terminou a execução");
    }
}