package sincronia;

public class MinhaSoma implements Runnable {
    private  String nome;
    private  int[] nums;
    private static ExecucaoSincronizada calc = new ExecucaoSincronizada();

    public MinhaSoma(String nome, int[] nums) {
        this.nome = nome;
        this.nums = nums;
        new Thread(this, nome).start();
    }

    @Override
    public void run() {
        System.out.println(this.nome + " - Tarefa iniciada");
        int soma = calc.getSoma(this.nums);
        System.out.println(this.nome + " - Tarefa finalizada _ Resultado = " + soma);


    }

    public static void main(String[] args) {
        MinhaSoma soma = new MinhaSoma("Tarefa1", new int[]{1, 2, 3, 4, 5});
        MinhaSoma soma2 = new MinhaSoma("Tarefa2", new int[]{1, 2, 3, 4, 5});

    }
}
