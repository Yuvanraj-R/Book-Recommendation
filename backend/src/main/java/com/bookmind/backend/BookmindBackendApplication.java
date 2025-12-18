package com.bookmind.backend;

import com.bookmind.backend.model.Book;
import com.bookmind.backend.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookmindBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookmindBackendApplication.class, args);
    }

    @Bean
    CommandLineRunner run(BookRepository repository) {
        return args -> {
            repository.deleteAll();
            System.out.println("🧹 Cleared Database...");
            System.out.println("🚀 Seeding HUGE collection of Real Books...");

            addRealBooks(repository);

            System.out.println("✅ DATABASE LOADED: " + repository.count() + " real books ready!");
        };
    }

    private void addRealBooks(BookRepository repo) {

        // ==========================================
        // TAMIL BOOKS (Classics + Modern)
        // ==========================================
        repo.save(new Book("Ponniyin Selvan I", "Kalki", "Historical Fiction", "adventurous", "Tamil", 400, 5.0,
                "The classic Chola dynasty saga.", "images/ps.jpeg"));

        repo.save(new Book("Sivagamiyin Sabatham", "Kalki", "Historical Fiction", "serious", "Tamil", 500, 4.8,
                "Pallava empire intrigue.", "images/ss.jpg"));

        repo.save(new Book("Velpari", "Su. Venkatesan", "Historical Fiction", "adventurous", "Tamil", 650, 4.9,
                "The epic of the tribal king Velpari.", "images/velu.jpeg"));

        repo.save(new Book("En Iniya Iyanthira", "Sujatha", "Sci-Fi", "adventurous", "Tamil", 280, 4.8,
                "A futuristic sci-fi thriller about a robot dog.", "images/eii.jpg"));

        repo.save(new Book("Karaiyellam Shenbagapoo", "Sujatha", "Mystery", "focused", "Tamil", 220, 4.7,
                "A gripping thriller set in a village.", "images/karai.jpg"));

        repo.save(new Book("Moga Mul", "Thi. Janakiraman", "Romance", "emotional", "Tamil", 350, 4.6,
                "A deep musical love story.", "images/mogu.jpg"));

        repo.save(new Book("Sila Nerangalil Sila Manithargal", "Jayakanthan", "Fiction", "serious", "Tamil", 240, 4.7,
                "A powerful social novel.", "images/silla.jpg"));

        repo.save(new Book("Kadal Pura", "Sandilyan", "Historical Fiction", "adventurous", "Tamil", 480, 4.8,
                "Naval adventures of the Cholas.", "images/kadal.jpg"));

        repo.save(new Book("Alai Osai", "Kalki", "Historical Fiction", "serious", "Tamil", 420, 4.8,
                "Freedom struggle saga.", "images/alai.jpg"));
        // ==========================================
        // EXTRA TAMIL BOOKS (+25)
        // ==========================================
        repo.save(new Book("Parthiban Kanavu", "Kalki", "Historical Fiction", "adventurous", "Tamil", 360, 4.8,
                "Prince Vikraman’s dream of a free Chola kingdom.", "images/par.jpg"));

        repo.save(new Book("Yavana Rani", "Sandilyan", "Historical Fiction", "adventurous", "Tamil", 520, 4.7,
                "A Chola prince and a Greek queen in a swashbuckling saga.", "images/yr.jpg"));

        repo.save(new Book("Thillana Mohanambal", "Kothamangalam Subbu", "Fiction", "emotional", "Tamil", 260, 4.6,
                "A love story between a dancer and a nadaswaram vidwan.", "images/tilana.jpg"));

        repo.save(new Book("Moondram Ulagam", "Sujatha", "Sci-Fi", "focused", "Tamil", 280, 4.7,
                "A mind-bending journey into alternate worlds.", "images/moondram ulagam.jpg"));

        repo.save(new Book("Kolaiyuthir Kaalam", "Sujatha", "Mystery", "serious", "Tamil", 320, 4.8,
                "A chilling murder mystery with psychological depth.", "images/kok.jpg"));

        repo.save(new Book("Nylon Kayiru", "Sujatha", "Mystery", "focused", "Tamil", 220, 4.6,
                "A suspense story built around a simple nylon rope.", "images/nylon rope.jpg"));

        repo.save(new Book("Oru Puliyamarathin Kathai", "Sundara Ramasamy", "Fiction", "serious", "Tamil", 250, 4.7,
                "A village and its people seen through a tamarind tree.", "images/opk.jpg"));

        repo.save(new Book("Oru Manithanin Kathai", "Sivasankari", "Fiction", "emotional", "Tamil", 300, 4.6,
                "A powerful portrayal of an ordinary man's struggles.", "images/omk.jpg"));

        repo.save(new Book("Oru Nadigaiyin Vaalkkai", "Sivasankari", "Fiction", "serious", "Tamil", 280, 4.5,
                "The rise and fall of an actress in the film world.", "images/onv.jpg"));

        repo.save(new Book("Idhaya Rani", "Ramanichandran", "Romance", "emotional", "Tamil", 240, 4.5,
                "A tender romantic story with emotional twists.", "images/ir.jpeg"));

        repo.save(new Book("Meendum Oru Kadhal Kathai", "Ramanichandran", "Romance", "relaxed", "Tamil", 230, 4.4,
                "Love gets a second chance against all odds.", "images/mok.jpg"));

        repo.save(new Book("Kallikaattu Ithigaasam", "Vairamuthu", "Fiction", "serious", "Tamil", 260, 4.7,
                "A moving tale of villagers displaced by a dam.", "images/ki.jpg"));

        repo.save(new Book("Karuvarai", "Vairamuthu", "Fiction", "emotional", "Tamil", 210, 4.5,
                "A woman’s emotional journey through hardship.", "images/kar.jpg"));

        repo.save(new Book("Kurinji Malar", "Vaasanthi", "Romance", "emotional", "Tamil", 260, 4.5,
                "Love blooms in the misty hills.", "images/km.jpg"));

        repo.save(new Book("Nizhalgal", "Sujatha", "Fiction", "serious", "Tamil", 230, 4.4,
                "Urban youth, disillusionment and searching for purpose.", "images/nizh.jpg"));

        repo.save(new Book("Sandhippu", "Sujatha", "Romance", "focused", "Tamil", 240, 4.5,
                "A modern love story set against changing times.", "images/santh.jpg"));

        repo.save(new Book("Vidiyal", "Sujatha", "Fiction", "motivated", "Tamil", 220, 4.4,
                "Hope and new beginnings after darkness.", "images/vidi.jpg"));

        repo.save(new Book("Pagal Nilavu", "Various Authors", "Fiction", "relaxed", "Tamil", 210, 4.3,
                "A set of contemporary short stories of love and loss.", "images/pag.jpg"));

        repo.save(new Book("Anbe Aaruyire", "Ramanichandran", "Romance", "emotional", "Tamil", 250, 4.5,
                "Pure romance with emotional highs and lows.", "images/anb.jpg"));

        repo.save(new Book("Uyire Unakkaga", "Ramanichandran", "Romance", "relaxed", "Tamil", 240, 4.4,
                "Two hearts learning to trust again.", "images/uu.jpg"));

        repo.save(new Book("Minnale", "Various Authors", "Fiction", "emotional", "Tamil", 200, 4.3,
                "Young love captured in a set of short stories.", "images/min.jpg"));

        repo.save(new Book("Kadhal Desam", "Various Authors", "Romance", "relaxed", "Tamil", 210, 4.2,
                "Feel–good tales of campus romance and friendship.", "images/kd.jpg"));


        // ==========================================
        // MALAYALAM BOOKS
        // ==========================================
        repo.save(new Book("Aadujeevitham", "Benyamin", "Fiction", "emotional", "Malayalam", 280, 4.9,
                "Najeeb's survival in the desert.", "images/aadu.jpg"));

        repo.save(new Book("Khasakkinte Itihasam", "O.V. Vijayan", "Fiction", "serious", "Malayalam", 300, 4.9,
                "Existential classic set in Khasak.", "images/khasa.jpg"));

        repo.save(new Book("Chemmeen", "Thakazhi Sivasankara Pillai", "Romance", "emotional", "Malayalam", 210, 4.8,
                "A tragic love story by the sea.", "images/che.jpg"));

        repo.save(new Book("Balyakalasakhi", "Basheer", "Romance", "emotional", "Malayalam", 110, 4.8,
                "A tragic childhood love story.", "images/balya.jpg"));

        repo.save(new Book("Randamoozham", "M.T. Vasudevan Nair", "Historical Fiction", "serious", "Malayalam", 450, 5.0,
                "Mahabharata from Bhima's perspective.", "images/randa.jpg"));

        repo.save(new Book("Oru Sankeerthanam Pole", "Perumbadavam Sreedharan", "Romance", "emotional", "Malayalam", 180, 4.7,
                "Based on the life of Fyodor Dostoevsky.", "images/oru.jpg"));

        repo.save(new Book("Mayyazhippuzhayude Theerangalil", "M. Mukundan", "Historical Fiction", "serious", "Malayalam", 320, 4.6,
                "Life in French Mahe.", "images/mayya.jpg"));

        repo.save(new Book("Pathummayude Aadu", "Basheer", "Fiction", "relaxed", "Malayalam", 120, 4.9,
                "Humorous tale of everyday life.", "images/pathu.jpg"));
        // ==========================================
        // EXTRA MALAYALAM BOOKS (+25)
        // ==========================================
        repo.save(new Book("Naalukettu", "M.T. Vasudevan Nair", "Fiction", "serious", "Malayalam", 260, 4.9,
                "A classic about a boy growing up in a matrilineal household.", "images/nalukettu.jpg"));

        repo.save(new Book("Manju", "M.T. Vasudevan Nair", "Fiction", "emotional", "Malayalam", 200, 4.7,
                "A quiet, introspective tale set in the hills.", "images/manju.jpg"));

        repo.save(new Book("Indulekha", "O. Chandu Menon", "Fiction", "serious", "Malayalam", 280, 4.7,
                "One of the earliest Malayalam novels about social reform.", "images/indu.jpg"));

        repo.save(new Book("Odayil Ninnu", "P. Kesavadev", "Fiction", "emotional", "Malayalam", 220, 4.6,
                "A rickshaw puller’s journey through hardship and dignity.", "images/oda.jpg"));

        repo.save(new Book("Anubhavangal Paalichakal", "Thakazhi Sivasankara Pillai", "Fiction", "serious", "Malayalam", 320, 4.8,
                "A brutal and honest portrayal of a man’s life.", "images/anu.jpg"));

        repo.save(new Book("Arachar", "K.R. Meera", "Fiction", "serious", "Malayalam", 430, 4.8,
                "A woman executioner’s powerful story.", "images/ara.jpg"));

        repo.save(new Book("Agnisakshi", "Lalithambika Antharjanam", "Fiction", "emotional", "Malayalam", 260, 4.7,
                "Tradition versus freedom in a Namboothiri family.", "images/agni.jpg"));

        repo.save(new Book("Ente Katha", "Kamala Surayya", "Biography", "serious", "Malayalam", 230, 4.7,
                "A bold, frank autobiography of the writer.", "images/ente.jpg"));

        repo.save(new Book("Verukal", "Malayattoor Ramakrishnan", "Fiction", "emotional", "Malayalam", 210, 4.6,
                "Roots, memories and the pull of one’s native place.", "images/veru.jpg"));

        repo.save(new Book("Smarakasilakal", "Punathil Kunjabdulla", "Fiction", "serious", "Malayalam", 260, 4.6,
                "Life and politics in a north Kerala village.", "images/smara.jpg"));

        repo.save(new Book("Daivathinte Vikrithikal", "M. Mukundan", "Fiction", "serious", "Malayalam", 250, 4.5,
                "Strange happenings in a small coastal town.", "images/dai.jpg"));

        repo.save(new Book("Delhi Gadhakal", "M. Mukundan", "Fiction", "serious", "Malayalam", 300, 4.5,
                "Life of Malayalis in Delhi and their struggles.", "images/delhi.jpg"));

        repo.save(new Book("Neermathalam Poothakalam", "Madavikutty", "Fiction", "emotional", "Malayalam", 200, 4.6,
                "A lyrical exploration of memory and longing.", "images/neer.jpg"));

        repo.save(new Book("Randam Bhavam", "Various Authors", "Mystery", "focused", "Malayalam", 210, 4.3,
                "Dark, twisty tales with psychological suspense.", "https://placehold.co/400x600/2a2d45/ffba5a?text=Randam+Bhavam"));

        repo.save(new Book("Mizhineer Pookkal", "Various Authors", "Romance", "emotional", "Malayalam", 220, 4.3,
                "Romantic stories set in modern Kerala.", "images/mizhi.jpg"));

        repo.save(new Book("Kazhcha", "Various Authors", "Fiction", "relaxed", "Malayalam", 200, 4.2,
                "Slice-of-life narratives capturing everyday beauty.", "images/kazh.jpg"));

        repo.save(new Book("Swapnangalude Rajyam", "Various Authors", "Fiction", "motivated", "Malayalam", 210, 4.2,
                "Inspiring stories about dreams and ambitions.", "images/swap.jpg"));

        repo.save(new Book("Oru Chiru Thulli", "Various Authors", "Fiction", "relaxed", "Malayalam", 190, 4.1,
                "Light-hearted stories filled with humour and warmth.", "https://placehold.co/400x600/2a2d45/ffba5a?text=Oru+Chiru+Thulli"));

        repo.save(new Book("Hridayapoorvam", "Various Authors", "Romance", "emotional", "Malayalam", 210, 4.2,
                "Heartfelt romantic shorts for cozy reading.", "images/hri.jpg"));

        repo.save(new Book("Oru Nimisham", "Various Authors", "Fiction", "focused", "Malayalam", 200, 4.2,
                "Stories that capture life-changing moments.", "images/orunimi.jpg"));

        repo.save(new Book("Mizhikalil Oru Mazha", "Various Authors", "Fiction", "emotional", "Malayalam", 220, 4.2,
                "Melancholic yet hopeful tales about relationships.", "images/mazha.jpg"));

        repo.save(new Book("Vasantha Swapnangal", "Various Authors", "Fiction", "relaxed", "Malayalam", 210, 4.1,
                "Spring-like feel–good stories.", "images/vasantha.jpg"));

        repo.save(new Book("Puzhayude Theerangal", "Various Authors", "Fiction", "serious", "Malayalam", 230, 4.2,
                "Riverbank stories about people and change.", "images/puzh.jpg"));

        repo.save(new Book("Thanmathra", "Various Authors", "Fiction", "serious", "Malayalam", 220, 4.3,
                "Family, memory and identity explored through poignant tales.", "images/than.jpg"));

        repo.save(new Book("Oru Kavitha Parayamo", "Various Authors", "Fiction", "motivated", "Malayalam", 200, 4.2,
                "Inspiring stories interwoven with poetry.", "images/kavi.jpg"));
        repo.save(new Book("Balyakalasakhi", "Vaikom Muhammad Basheer", "Romance", "emotional", "Malayalam", 130, 4.8,

                "A heartbreaking love story of Majeed and Suhra.",

                "images/bal.jpg"));


        // ==========================================
        // TELUGU BOOKS
        // ==========================================
        repo.save(new Book("Veyi Padagalu", "Viswanatha Satyanarayana", "Historical Fiction", "serious", "Telugu", 900, 5.0,
                "A monumental novel depicting culture.", "images/veyi.jpg"));

        repo.save(new Book("Tulasi Dalam", "Yandamoori Veerendranath", "Sci-Fi", "adventurous", "Telugu", 280, 4.8,
                "A thriller involving witchcraft and psychology.", "images/tul.jpg"));

        repo.save(new Book("Vennello Aadapilla", "Yandamoori Veerendranath", "Romance", "focused", "Telugu", 250, 4.7,
                "A strategic chess game of love and intellect.", "images/ven.jpg"));

        repo.save(new Book("Amaraavati Kathalu", "Satyam Sankaramanchi", "Fiction", "relaxed", "Telugu", 200, 4.9,
                "Heartwarming short stories.", "images/amar.jpg"));

        repo.save(new Book("Barrister Parvateesam", "Mokkapati", "Fiction", "relaxed", "Telugu", 180, 4.7,
                "A hilarious journey to England.", "images/bar.jpg"));

        repo.save(new Book("Asura", "Anand Neelakantan", "Historical Fiction", "serious", "Telugu", 450, 4.8,
                "Tale of the Vanquished.", "images/asura.jpg"));

        repo.save(new Book("Maha Prasthanam", "Sri Sri", "Fiction", "motivated", "Telugu", 120, 4.9,
                "Revolutionary poetry.", "images/maha.jpg"));
        // ==========================================
        // EXTRA TELUGU BOOKS (+25)
        // ==========================================
        repo.save(new Book("Kanyasulkam", "Gurajada Apparao", "Fiction", "serious", "Telugu", 260, 4.9,
                "A classic social satire on the dowry system.", "images/t1.jpg"));

        repo.save(new Book("Chivaraku Migiledi", "Sivaraju Subbarao (Sri Sri)", "Fiction", "emotional", "Telugu", 220, 4.7,
                "A powerful, emotional exploration of love and guilt.", "images/t2.jpg"));

        repo.save(new Book("Madhyataragati Mahabharatam", "Yandamoori Veerendranath", "Fiction", "serious", "Telugu", 300, 4.7,
                "Middle-class struggles retold like a modern epic.", "images/t3.jpg"));

        repo.save(new Book("Chinnari Chittakuru", "Ranganayakamma", "Fiction", "serious", "Telugu", 240, 4.6,
                "A critical look at patriarchy and society.", "images/t4.jpg"));

        repo.save(new Book("Alpajeevi", "Ranganayakamma", "Fiction", "serious", "Telugu", 260, 4.5,
                "The life of a 'small' person in a complex world.", "images/t5.jpg"));

        repo.save(new Book("Saptabhoomi", "Yandamoori Veerendranath", "Fiction", "focused", "Telugu", 280, 4.6,
                "Ambitions and relationships spanning seven places.", "images/t6.jpg"));

        repo.save(new Book("Dabbu To Theerchukuntaam", "Yandamoori Veerendranath", "Self-Help", "motivated", "Telugu", 230, 4.5,
                "A practical, story-based guide around money and success.", "images/t7.jpg"));

        repo.save(new Book("Yugandhar", "Yandamoori Veerendranath", "Fiction", "motivated", "Telugu", 310, 4.7,
                "A charismatic leader’s story and his impact.", "images/t8.jpg"));

        repo.save(new Book("Jeevana Tarangalu", "Yandamoori Veerendranath", "Fiction", "emotional", "Telugu", 260, 4.6,
                "Waves of life and relationships.", "images/t9.jpg"));

        repo.save(new Book("Chandraharam", "Madhubabu", "Mystery", "adventurous", "Telugu", 240, 4.4,
                "A classic detective style thriller.", "images/t10.jpg"));


        // ==========================================
        // HINDI BOOKS
        // ==========================================
        repo.save(new Book("Godan", "Premchand", "Fiction", "serious", "Hindi", 320, 5.0,
                "The Gift of a Cow - peasant life.", "images/godan.jpg"));

        repo.save(new Book("Gunahon Ka Devta", "Dharamvir Bharati", "Romance", "emotional", "Hindi", 280, 4.9,
                "A heartbreaking cult classic love story.", "images/gun.jpg"));

        repo.save(new Book("Madhushala", "Harivansh Rai Bachchan", "Fiction", "relaxed", "Hindi", 100, 4.8,
                "Deeply philosophical poetry about life.", "images/mad.jpg"));

        repo.save(new Book("Rashmirathi", "Ramdhari Singh Dinkar", "Historical Fiction", "motivated", "Hindi", 150, 4.9,
                "The epic tale of Karna.", "images/rash.jpg"));

        repo.save(new Book("Nirmala", "Premchand", "Fiction", "emotional", "Hindi", 230, 4.7,
                "A tragedy of dowry and mismatch marriage.", "images/nir.jpg"));

        repo.save(new Book("Meluha Ke Mritunjay", "Amish Tripathi", "Sci-Fi", "adventurous", "Hindi", 390, 4.7,
                "Shiva Trilogy Book 1.", "images/mel.jpg"));

        repo.save(new Book("Tamas", "Bhisham Sahni", "Historical Fiction", "serious", "Hindi", 240, 4.7,
                "Partition of India story.", "images/tam.jpg"));
        // ==========================================
        // EXTRA HINDI BOOKS (+25)
        // ==========================================
        repo.save(new Book("Gaban", "Premchand", "Fiction", "serious", "Hindi", 320, 4.8,
                "A man’s downfall because of his greed to impress others.", "images/h1.jpg"));

        repo.save(new Book("Rangbhoomi", "Premchand", "Fiction", "serious", "Hindi", 450, 4.8,
                "A blind beggar becomes a symbol of resistance.", "images/h2.jpg"));

        repo.save(new Book("Nirmala", "Premchand", "Fiction", "emotional", "Hindi", 260, 4.7,
                "A young girl in a tragic mismatched marriage.", "images/h3.jpg"));

        repo.save(new Book("Raag Darbari", "Shrilal Shukla", "Fiction", "serious", "Hindi", 380, 4.9,
                "A biting satire on Indian rural politics and bureaucracy.", "images/h4.jpg"));

        repo.save(new Book("Maila Anchal", "Phanishwar Nath Renu", "Fiction", "serious", "Hindi", 360, 4.8,
                "Life and politics in a backward region of Bihar.", "images/h5.jpg"));

        repo.save(new Book("Volga Se Ganga", "Rahul Sankrityayan", "Historical Fiction", "serious", "Hindi", 420, 4.7,
                "Stories tracing civilization from the Volga to the Ganga.", "images/h6.jpg"));

        repo.save(new Book("Kamayani", "Jaishankar Prasad", "Fiction", "focused", "Hindi", 280, 4.7,
                "A philosophical epic-poem on human emotions.", "images/h7.jpg"));

        repo.save(new Book("Chandrakanta", "Devaki Nandan Khatri", "Fantasy", "adventurous", "Hindi", 400, 4.6,
                "A fantasy classic full of tilisms and adventures.", "images/h8.jpg"));

        repo.save(new Book("Chitralekha", "Bhagwati Charan Verma", "Fiction", "serious", "Hindi", 260, 4.6,
                "Explores sin, virtue and human desires.", "images/h9.jpg"));

        repo.save(new Book("Gunahon Ka Devta", "Dharamvir Bharati", "Romance", "emotional", "Hindi", 280, 4.9,
                "Unspoken love in a small-town university setting.", "images/h10.jpg"));

        repo.save(new Book("Kitne Pakistan", "Kamleshwar", "Fiction", "serious", "Hindi", 380, 4.7,
                "Partition, identity and borders re-examined in court-of-history style.", "images/h11.jpg"));

        repo.save(new Book("Tamas", "Bhisham Sahni", "Historical Fiction", "serious", "Hindi", 260, 4.8,
                "Partition violence and human tragedy.", "images/h12.jpg"));

        repo.save(new Book("Madhushala", "Harivansh Rai Bachchan", "Poetry", "relaxed", "Hindi", 140, 4.8,
                "Metaphorical tavern that reflects on life and existence.", "images/h13.jpg"));

        repo.save(new Book("Rashmirathi", "Ramdhari Singh Dinkar", "Poetry", "motivated", "Hindi", 180, 4.9,
                "Karna’s story in powerful, inspiring verse.", "images/h14.jpg"));

        repo.save(new Book("Mritunjay", "Shivaji Sawant", "Historical Fiction", "serious", "Hindi", 520, 4.9,
                "Another masterful retelling of Karna’s life.", "images/h15.jpg"));
        // HINDI (shorter, quick reads)

        repo.save(new Book("Madhushala", "Harivansh Rai Bachchan", "Poetry", "relaxed", "Hindi", 120, 4.9,

                "Iconic philosophical poetry built around a tavern metaphor.",

                "images/madhu.jpg"));



        repo.save(new Book("Idgah", "Premchand", "Fiction", "emotional", "Hindi", 100, 4.7,

                "A classic short story of a boy, his love for his grandmother, and a fair.",

                "images/idgah.jpg"));


        // ==========================================
        // ENGLISH BOOKS (Top Bestsellers)
        // ==========================================
        repo.save(new Book("Atomic Habits", "James Clear", "Self-Help", "motivated", "English", 180, 4.9,
                "Tiny changes, big results.", "images/atom.jpg"));

        repo.save(new Book("The Psychology of Money", "Morgan Housel", "Self-Help", "focused", "English", 230, 4.8,
                "Timeless lessons on wealth.", "images/money.jpg"));

        repo.save(new Book("Can't Hurt Me", "David Goggins", "Biography", "motivated", "English", 360, 4.9,
                "Master your mind and defy the odds.", "images/me.jpg"));

        repo.save(new Book("Steve Jobs", "Walter Isaacson", "Biography", "focused", "English", 500, 4.8,
                "The exclusive biography.", "images/steve.jpg"));

        repo.save(new Book("Wings of Fire", "APJ Abdul Kalam", "Biography", "motivated", "English", 180, 5.0,
                "An autobiography of the Missile Man.", "images/fire.jpg"));

        repo.save(new Book("The Alchemist", "Paulo Coelho", "Fiction", "adventurous", "English", 110, 4.8,
                "Follow your personal legend.", "images/alc.jpg"));

        repo.save(new Book("The Silent Patient", "Alex Michaelides", "Fiction", "serious", "English", 260, 4.6,
                "A shocking psychological thriller.", "images/shh.jpg"));

        repo.save(new Book("Harry Potter", "J.K. Rowling", "Fiction", "adventurous", "English", 320, 4.9,
                "The Sorcerer's Stone.", "images/harry.jpg"));

        repo.save(new Book("Dune", "Frank Herbert", "Sci-Fi", "serious", "English", 600, 4.8,
                "Epic sci-fi saga on Arrakis.", "images/dune.jpg"));

        repo.save(new Book("Project Hail Mary", "Andy Weir", "Sci-Fi", "adventurous", "English", 350, 4.9,
                "A lone astronaut saves the world.", "images/hail.jpg"));

        repo.save(new Book("It Ends With Us", "Colleen Hoover", "Romance", "emotional", "English", 300, 4.5,
                "A powerful romance novel.", "images/us.jpg"));

        repo.save(new Book("Rich Dad Poor Dad", "Robert Kiyosaki", "Self-Help", "motivated", "English", 210, 4.7,
                "Financial education.", "images/dad.jpg"));

        repo.save(new Book("The Great Gatsby", "F. Scott Fitzgerald", "Fiction", "serious", "English", 200, 4.7,
                "A classic of the Jazz Age.", "images/great.jpg"));
        // ==========================================
        // EXTRA ENGLISH BOOKS (+25)
        // ==========================================
        repo.save(new Book("1984", "George Orwell", "Fiction", "serious", "English", 320, 4.9,
                "A dystopian classic about surveillance and control.", "images/e1i.jpg"));

        repo.save(new Book("To Kill a Mockingbird", "Harper Lee", "Fiction", "serious", "English", 330, 4.9,
                "A moving story of justice and race in the American South.", "images/e2.jpg"));

        repo.save(new Book("Sapiens", "Yuval Noah Harari", "Non-Fiction", "focused", "English", 410, 4.8,
                "A brief history of humankind.", "images/e3.jpg"));

        repo.save(new Book("The Subtle Art of Not Giving a F*ck", "Mark Manson", "Self-Help", "relaxed", "English", 240, 4.5,
                "Counterintuitive advice about living a good life.", "images/e4.jpg"));

        repo.save(new Book("Deep Work", "Cal Newport", "Self-Help", "focused", "English", 260, 4.6,
                "Rules for focused success in a distracted world.", "images/e5.jpg"));

        repo.save(new Book("Thinking, Fast and Slow", "Daniel Kahneman", "Non-Fiction", "focused", "English", 480, 4.7,
                "Two systems that drive the way we think.", "images/e6.jpg"));

        repo.save(new Book("The 7 Habits of Highly Effective People", "Stephen R. Covey", "Self-Help", "motivated", "English", 380, 4.7,
                "Timeless principles for personal effectiveness.", "images/e7.jpg"));

        repo.save(new Book("Man’s Search for Meaning", "Viktor E. Frankl", "Biography", "serious", "English", 200, 4.9,
                "A Holocaust survivor’s reflections on meaning and purpose.", "images/e8.jpg"));

        repo.save(new Book("Shoe Dog", "Phil Knight", "Biography", "motivated", "English", 400, 4.8,
                "The memoir of Nike’s creator.", "images/e9.jpg"));

        repo.save(new Book("The Lean Startup", "Eric Ries", "Non-Fiction", "focused", "English", 320, 4.5,
                "Entrepreneurial approach for building products that succeed.", "images/e10.jpg"));

        repo.save(new Book("Clean Code", "Robert C. Martin", "Non-Fiction", "focused", "English", 430, 4.8,
                "A handbook of agile software craftsmanship.", "images/e11.jpg"));

        repo.save(new Book("Cracking the Coding Interview", "Gayle Laakmann McDowell", "Non-Fiction", "motivated", "English", 700, 4.7,
                "189 programming questions and solutions for tech interviews.", "images/e12.jpg"));

        repo.save(new Book("The Pragmatic Programmer", "Andrew Hunt & David Thomas", "Non-Fiction", "focused", "English", 320, 4.8,
                "Journey to mastery as a practical developer.", "images/e13.jpg"));

        repo.save(new Book("The Design of Everyday Things", "Don Norman", "Non-Fiction", "focused", "English", 360, 4.6,
                "How good design makes the world easier to use.", "images/e14.jpg"));

        repo.save(new Book("The 4-Hour Workweek", "Tim Ferriss", "Self-Help", "relaxed", "English", 320, 4.4,
                "Escape the 9–5 and live anywhere.", "images/e15.jpg"));

        repo.save(new Book("The Power of Now", "Eckhart Tolle", "Self-Help", "emotional", "English", 240, 4.6,
                "A guide to spiritual enlightenment in the present moment.", "images/e16.jpg"));

        repo.save(new Book("Ikigai", "Héctor García & Francesc Miralles", "Self-Help", "relaxed", "English", 210, 4.5,
                "The Japanese secret to a long and happy life.", "images/e17.jpg"));

        repo.save(new Book("Dopamine Nation", "Anna Lembke", "Non-Fiction", "serious", "English", 280, 4.5,
                "Finding balance in the age of indulgence.", "images/e18.jpg"));

        repo.save(new Book("The Midnight Library", "Matt Haig", "Fiction", "emotional", "English", 290, 4.4,
                "A library of infinite possible lives.", "images/e19.jpg"));

        repo.save(new Book("The Fault in Our Stars", "John Green", "Fiction", "emotional", "English", 310, 4.5,
                "Two teens fighting cancer and falling in love.", "images/e20.jpg"));

        repo.save(new Book("The Hunger Games", "Suzanne Collins", "Fiction", "adventurous", "English", 320, 4.5,
                "A deadly televised fight for survival.", "images/e21.jpg"));

        repo.save(new Book("The Martian", "Andy Weir", "Sci-Fi", "adventurous", "English", 370, 4.8,
                "An astronaut stranded alone on Mars.", "images/e22.jpg"));

        repo.save(new Book("Norwegian Wood", "Haruki Murakami", "Fiction", "serious", "English", 300, 4.4,
                "A nostalgic, melancholic story of love and loss.", "images/e23.jpg"));

        repo.save(new Book("The Kite Runner", "Khaled Hosseini", "Fiction", "emotional", "English", 340, 4.8,
                "Friendship, guilt and redemption from Kabul to America.", "images/e24.jpg"));

        repo.save(new Book("The Girl on the Train", "Paula Hawkins", "Mystery", "serious", "English", 320, 4.2,
                "A psychological thriller told by an unreliable narrator.", "images/e25.jpg"));

        repo.save(new Book("Gone Girl", "Gillian Flynn", "Mystery", "serious", "English", 420, 4.3,
                "A marriage turned into a toxic mind game.", "images/e26.jpg"));
        // 100–150 minutes reads

// ===============================



// ENGLISH

        repo.save(new Book("Of Mice and Men", "John Steinbeck", "Fiction", "serious", "English", 120, 4.8,

                "A tragic story of two migrant workers chasing their dream.",

                "images/omm.jpg"));



        repo.save(new Book("The Old Man and the Sea", "Ernest Hemingway", "Fiction", "serious", "English", 120, 4.8,

                "An aging fisherman battles a giant marlin far out at sea.",

                "images/sea.jpg"));



        repo.save(new Book("The Metamorphosis", "Franz Kafka", "Fiction", "serious", "English", 130, 4.6,

                "Gregor Samsa wakes up one day turned into a giant insect.",

                "images/meta.jpg"));



        repo.save(new Book("The Little Prince", "Antoine de Saint-Exupéry", "Fiction", "emotional", "English", 110, 4.9,

                "A young prince’s journey through planets and people.",

                "images/prince.jpg"));

    }
}