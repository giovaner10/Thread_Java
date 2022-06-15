package sincronia;

public class ExecucaoSincronizada {
    private int soma;

    public synchronized int getSoma(int[] array){
        for (int i: array) {
            soma += i;

            System.out.println("Somando " + soma +" com " + i + " -- Tarefa: " + Thread.currentThread().getName());
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return soma;
    }
}
