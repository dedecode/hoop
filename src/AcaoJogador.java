import java.util.Random;

public class AcaoJogador {

    public int testeStatus(int i) {
        Random rand = new Random();
        int n = rand.nextInt(i);

        return n;
    }
    // Adicionar possivel evento de toco
    public void resultadoArremeso(Jogador i,Jogador j){
        String resultado;
        int chanceArremesso = (int) (i.arremesso - (j.bloqueio) * 0.15);
        Random rand = new Random();
        int eventoArremesso = rand.nextInt(101);
        System.out.println("Chance Arremesso: " + chanceArremesso);
        System.out.println("Evento Arremesso: " + eventoArremesso);
        if(eventoArremesso <= (100 - chanceArremesso)){
            resultado = "Arremasso Falho!";
        }
            // else if(){
        //   chance de toco
        // }
        
        else{
            resultado = "BANG! BANG! BANG!";
        }
        System.out.println(i.nome + " executa o arremesso, e... " + resultado);
    }

}

