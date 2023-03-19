public class ChersRecruteurs {
    public static void main(String[] args) {
        String nom = "El Ghaouti Aymane";
        String ecole = "l'école des genie informatique ESGI";
        String annee = "2023/2024";
        String domaine1 = "développement Java";
        String domaine2 = "développement web";
        String[] technologies = {"AWS", "NodeJS", "Angular", "Kubernetes", "Spring Batch", "Hibernate", "Jenkins"};

        String message = "Bonjour, je m'appelle " + nom + ", prochainement étudiant à " + ecole + " pour la rentrée " + annee + ", à la recherche d'une opportunité professionnelle en tant qu'apprenti en " + domaine1 + " ou " + domaine2 + " pour poursuivre mon apprentissage et acquérir une expérience pratique.\n\nJe suis passionné par le développement Java et les languages du développement web, et j'ai des connaissances sur les technologies suivantes :";

        for(String tech : technologies){
            message += " " + tech + ",";
        }
        message = message.substring(0, message.length()-1) + ".";

        message += "\n\nN'hésitez pas à me contacter si vous avez des questions ou des opportunités à discuter. Je suis ouvert à toutes les propositions et je suis prêt à relever de nouveaux défis pour développer mes compétences et contribuer à la réussite de votre entreprise.";

        System.out.print(message);    }
}