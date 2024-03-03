import Jogo.Jogo;
import Jogo.UI;
import Tabuleiro.TabuleiroException;
import Jogo.JogoException;

public class Main {
    public static void main(String[] args) {

        try{
            UI ui = new UI();
            Jogo jogo = new Jogo(ui.pegaNomeJogador(), ui.pegaNomeJogador());
            ui.printaTabuleiro(jogo);
            jogo.movimentaPeca(2, 0, 3, 1);
            System.out.println();
            ui.printaTabuleiro(jogo);
            jogo.movimentaPeca(5, 1, 4, 0);
            System.out.println();
            ui.printaTabuleiro(jogo);
            jogo.movimentaPeca(2, 2, 3, 3);
            System.out.println();
            ui.printaTabuleiro(jogo);
            jogo.movimentaPeca(4, 0, 2, 2);
            System.out.println();
            ui.printaTabuleiro(jogo);
            jogo.movimentaPeca(2, 2, 4, 4);
            System.out.println();
            ui.printaTabuleiro(jogo);
        }catch(TabuleiroException | JogoException e){
            System.out.println(e.getMessage());
        }
    }
}