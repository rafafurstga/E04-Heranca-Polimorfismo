public class PessoaJuridica extends Cliente{
    /*String cnpj: cpnj da PJ
int numFuncionarios: Número de funcionários da PJ
String setor*/
    String cnpj;
    int numFuncionarios;
    String setor;

    int getNumFuncionarios(){
        return this.numFuncionarios;
    }

    int setNumFuncionarios(int numFuncionarios){
        this.numFuncionarios = numFuncionarios;
        return this.numFuncionarios;
    }

    String getSetor(){
        return this.setor;
    }

    String setSetor(String setor){
        this.setor = setor;
        return this.setor;
    }

    String getCnpj(){
        return this.cnpj;
    }

    PessoaJuridica(String nome, String cnpj, String endereco, int numFuncionarios, String setor){
        super(nome, endereco);
        this.cnpj = cnpj;
        this.numFuncionarios = numFuncionarios;
        this.setor = setor;
    }
}
