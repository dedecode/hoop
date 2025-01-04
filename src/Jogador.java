public class Jogador {

    public String nome;
    public int arremesso;
    public int drible;
    public int enterrada;
    public int defesa;
    public int bloqueio;
    

    AcaoJogador acao = new AcaoJogador();
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getArremesso() {
        return arremesso;
    }

    public void setArremesso(int arremesso) {
        this.arremesso = arremesso;
    }

    public int getDrible() {
        return drible;
    }

    public void setDrible(int drible) {
        this.drible = drible;
    }

    public int getEnterrada() {
        return enterrada;
    }

    public void setEnterrada(int enterrada) {
        this.enterrada = enterrada;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getBloqueio() {
        return bloqueio;
    }

    public void setBloqueio(int bloqueio) {
        this.bloqueio = bloqueio;
    }

    public void mostrarInfos(Jogador j){
        System.out.println("Nome: " + j.nome);
        System.out.println("Arremesso: " + j.arremesso);
        System.out.println("Enterrada: " + j.enterrada);
        System.out.println("Defesa: " + j.defesa);
        System.out.println("Drible: " + j.drible);
        System.out.println("Bloqueio: " + j.bloqueio);
    }


}
