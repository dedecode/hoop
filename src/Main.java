import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Jogador giannis = new Jogador();
        giannis.setNome("Giannis Outentaconto");
        giannis.setArremesso(70);
        giannis.setEnterrada(99);
        giannis.setBloqueio(99);
        giannis.setDefesa(80);
        giannis.setDrible(70);
        giannis.setInfiltracao(99);
        giannis.setPasse(80);

        Jogador corre = new Jogador();
        curry.setNome("Stevão Corre");
        curry.setArremesso(100);
        curry.setEnterrada(70);
        curry.setBloqueio(60);
        curry.setDefesa(70);
        curry.setDrible(87);
        curry.setInfiltracao(88);
        curry.setPasse(80);

        Jogador simas = new Jogador();
        simmons.setNome("Bem Simas");
        simmons.setArremesso(30);
        simmons.setEnterrada(20);
        simmons.setBloqueio(20);
        simmons.setDefesa(20);
        simmons.setDrible(25);
        simmons.setInfiltracao(50);
        simmons.setPasse(59);

        ArrayList<Jogador> jogadores= new ArrayList<Jogador>();
        jogadores.add(giannis);
        jogadores.add(corre);
        jogadores.add(simas);

        Jogador info = new Jogador();
        info.mostrarInfos(giannis);
        info.mostrarInfos(corre);
        
        AcaoJogador arremesso = new AcaoJogador();
        arremesso.resultadoArremeso(giannis, corre);
    }
}
