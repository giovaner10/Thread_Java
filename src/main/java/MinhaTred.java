public class MinhaTred extends Thread {

    private String nome;
    private int tempo;

    public MinhaTred(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        start();
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
    }
}
