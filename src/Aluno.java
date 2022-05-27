public class Aluno extends Turma implements Boletim {

    private String nome;
    private int num_matricula;

    public Aluno(String nome, int num_matricula, double nota01, double nota02, double substitutiva) {
        this.nome = nome;
        this.num_matricula = num_matricula;
        super.nota01 = nota01;
        super.nota02 = nota02;
        super.substitutiva = substitutiva;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public int getNum_matricula() {

        return num_matricula;
    }

    public void setNum_matricula(int num_matricula) {

        this.num_matricula = num_matricula;
    }

    @Override
    public void notas() {
        System.out.println("===================================");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Matrícula: " + this.getNum_matricula());
        System.out.println("Nota 1: " + this.getNota01());
        System.out.println("Nota 2: " + this.getNota02());
        String result = String.format("%.2f", ((this.getNota01() + this.getNota02()) / 2));
        System.out.println("Média das notas: " + result);
        if (((nota01 + nota02) / 2 < 6)) {
            System.out.println("Reprovado, necessário prova substitutiva.");
        }
    }

    @Override
    public void notas(double comNotaSubstitutiva) {
        System.out.println("===================================");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Matrícula: " + this.getNum_matricula());
        System.out.println("Nota 1: " + this.getNota01());
        System.out.println("Nota 2: " + this.getNota02());
        String result = String.format("%.2f", this.getSubstitutiva());
        System.out.println("Nota substitutiva: " + result);
        if (getSubstitutiva() >= 6) {
            System.out.println("APROVADO! PARABÉNS!");
        } else {
            System.out.println("Infelizmente reprovado.");
        }
    }

}

