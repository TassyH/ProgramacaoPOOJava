package bomba;

public class Bomba {
	
	private int periodo;
    private boolean explodiu;
    private int quantidadeAlunos;


    public Bomba(int turma, boolean explodiu, int alunos){
        if(turma <1 || turma > 5){
            System.out.println("turma invalida");
        }else{
            this.periodo = turma;
        }
        this.explodiu = explodiu;
        this.quantidadeAlunos = alunos;
    }
    public Bomba(){

    }

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }
    public void setQuantidadeAlunos(int quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
    }
    public int getPeriodo() {
        return periodo;
    }
    public void setPeriodo(int turma) {
            this.periodo = turma;
    }
    public boolean isExplodiu() {
        return explodiu;
    }
    public void setExplodiu(boolean culpado) {
        this.explodiu = culpado;
    }

    public boolean bombardearTurma(){
        if(getPeriodo() == 2){
            System.out.println("Bombardeando turma.....");
            for(int i = 0; i <= getQuantidadeAlunos(); i++){
                System.out.println("BOOOMMM BOMBARDEANDO!!!!!!!!");
            }
            return isExplodiu() == true;
        }else{
            System.out.println(" vc nao é daquela turma miseravel, escapou! Mas fica de olho que se fizer merda o bicho pega pro teu lado tbm");
            return isExplodiu() == false;
        }
    }

    public void recadoInformativo(){
        System.out.println("Independente de qual turma vc for, racismo e xenefobia é crime. Dene-se vc e sua criação eu nao quero saber, vc é adulto agora e se fizer merda vamos chamar a policia :)");
        System.out.println(" A Lei 7.716/89, conhecida com Lei do Racismo, pune todo tipo de discriminação ou preconceito, seja de origem, raça, sexo, cor, idade");
        System.out.println("O crime de xenofobia está previsto na Lei Nº 9.459/97 e enquadra aqueles que possam vir a praticar, induzir, incitar a discriminação ou preconceito de raça, cor, etnia, religião ou procedência nacional. Além disso, quem comete xenofobia é passível a reclusão de um a três anos e multa");
        System.out.println("E para os professsores: a Marcela ficou muito mal com os relatos que ela ouviu que aconteceram naquela turma, pfv nao deixe eles impunes. Dar tapinhas nas coisas e dizer pra nao fazer mais é inadmissível, precis ser realmente castigado.");
    }

}
