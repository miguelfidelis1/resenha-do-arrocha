import java.util.Random;

public class ResenhaDoArrocha {
    public static void main(String[] args) {
        System.out.println("🎶 Primeiramente, vou lançar um pronunciamento aqui antes, né 🎶");
        System.out.println("Que na Bahia o que bate é maluquice... Então, eu vou lançar de maluquice aqui!");

        Tigrinho tigrinho = new Tigrinho();
        Eu euMesmo = new Eu();

        if (!tigrinho.soltaCarta()) {
            tigrinho.filhaDaPuta = true;
            System.out.println("Tigrinho não soltou a carta!");
        } else {
            euMesmo.pegarMeuDinheiro();
            euMesmo.comer("4 putas");
        }

        // Loop insano do vuk-vuk
        for (int i = 0; i < 4; i++) {
            System.out.println("É vuk-vuk, vuk, vuk na onda maluca!");
            for (int j = 0; j < 4; j++) {
                System.out.println("Vuk!");
            }
        }

        // Passinho do Romano
        System.out.println("Faz um passinho do romano, mais aquela sarrada no ar!");

        // Evento aleatório
        eventoAleatorio();
    }

    public static void eventoAleatorio() {
        String[] eventos = {
            "Ela roça no pau!", 
            "Toma sequência de pau!", 
            "Rala a xereca no Playba!",
            "Me bota, me bota, me bota!",
            "Vai ser só pau nas candjanga!",
            "Ela quer pegar na minha espada!"
        };

        Random random = new Random();
        String evento = eventos[random.nextInt(eventos.length)];

        System.out.println("🔥 Evento aleatório na festa: " + evento + " 🔥");
    }
}

// Classe Tigrinho
class Tigrinho {
    boolean filhaDaPuta = false;

    public boolean soltaCarta() {
        return new Random().nextBoolean(); // Aleatório se solta ou não
    }
}

// Classe Eu
class Eu {
    public void pegarMeuDinheiro() {
        System.out.println("Peguei meu dinheiro!");
    }

    public void comer(String comida) {
        System.out.println("Comendo " + comida);
    }
}
