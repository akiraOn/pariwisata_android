package com.example.myapplication;

import java.util.ArrayList;

public class data {

    private static String[] judul = {
            "Raja Ampat",
            "Pulau Komodo",
            "Candi Borobudur",
            "Danau Toba",
            "Yogyakarta",
            "Lombok",
            "Bali",
            "Tana Toraja",
            "Gunung Bromo",
            "Ngarai Sianok"
    };
    private static String[] deskripsi = {
            "Kepulauan Raja Ampat merupakan rangkaian empat gugusan pulau yang berdekatan dan berlokasi di barat bagian Kepala Burung (Vogelkoop) Pulau Papua. Secara administrasi, gugusan ini berada di bawah Kabupaten Raja Ampat, Provinsi Papua Barat. Kepulauan ini sekarang menjadi tujuan para penyelam yang tertarik akan keindahan pemandangan bawah lautnya. Empat gugusan pulau yang menjadi anggotanya dinamakan menurut empat pulau terbesarnya, yaitu Pulau Waigeo, Pulau Misool, Pulau Salawati, dan Pulau Batanta.",
            "Pulau Komodo adalah sebuah pulau yang terletak di Kepulauan Nusa Tenggara. Pulau Komodo dikenal sebagai habitat asli hewan komodo. Pulau ini juga merupakan kawasan Taman Nasional Komodo yang dikelola oleh Pemerintah Pusat. Pulau Komodo berada di sebelah timur Pulau Sumbawa, yang dipisahkan oleh Selat Sape. Secara administratif, pulau ini termasuk wilayah Kecamatan Komodo, Kabupaten Manggarai Barat, Provinsi Nusa Tenggara Timur, Indonesia. Pulau Komodo merupakan ujung paling barat Provinsi Nusa Tenggara Timur, berbatasan dengan Provinsi Nusa Tenggara Barat.",
            "Borobudur adalah sebuah candi Buddha yang terletak di Borobudur, Magelang, Jawa Tengah, Indonesia. Candi ini terletak kurang lebih 100 km di sebelah barat daya Semarang, 86 km di sebelah barat Surakarta, dan 40 km di sebelah barat laut Yogyakarta. Candi berbentuk stupa ini didirikan oleh para penganut agama Buddha Mahayana sekitar tahun 800-an Masehi pada masa pemerintahan wangsa Syailendra. Borobudur adalah candi atau kuil Buddha terbesar di dunia, sekaligus salah satu monumen Buddha terbesar di dunia.",
            "Danau Toba adalah danau berkawah seluas 1.145 kilometer persegi. Di tengahnya berdiam sebuah pulau dengan luas yang hampir sebanding dengan luas negara Singapura. Danau Toba sebenarnya lebih menyerupai lautan daripada danau mengingat ukurannya. Oleh karena itu, Danau Toba ditempatkan sebagai danau terluas di Asia Tenggara dan terbesar kedua di dunia sesudah Danau Victoria di Afrika. Danau Toba juga termasuk danau terdalam di dunia yaitu sekira 450 meter.",
            "Yogyakarta satu-satunya daerah di Indonesia yang dipimpin seorang raja. Sultan Jogja secara otomatis menjadi Gubernur, sedangkan wakilnya dijabat oleh Pakualam. Banyak tempat wisata di Yogyakarta yang kental dengan nuansa kebudayaan. Tahun 2017 lalu Yogyakarta disambangi 5 juta wisatawan yang terdiri dari 4,7 juta turis lokal dan 390 ribu turis asing. Mereka menyebar ke berbagai obyek wisata yang ada di Yogyakarta dan kota-kota sekitarnya. Lihat 10 tempat wisata populer di Yogyakarta.",
            "Pulau Lombok adalah sebuah pulau di kepulauan Sunda Kecil atau Nusa Tenggara yang terpisahkan oleh Selat Lombok dari Bali di sebelat barat dan Selat Alas di sebelah timur dari Sumbawa. Pulau ini kurang lebih berbentuk bulat dengan semacam \"ekor\" di sisi barat daya yang panjangnya kurang lebih 70 km. Luas pulau ini mencapai 5.435 km² menempatkannya pada peringkat 108 dari daftar pulau berdasarkan luasnya di dunia. Kota utama di pulau ini adalah Kota Mataram.",
            "Bali adalah sebuah provinsi di Indonesia yang ibu kota provinsinya bernama Denpasar. Bali juga merupakan salah satu pulau di Kepulauan Nusa Tenggara. Di awal kemerdekaan Indonesia, pulau ini termasuk dalam Provinsi Sunda Kecil yang beribu kota di Singaraja, dan kini terbagi menjadi 3 provinsi: Bali, Nusa Tenggara Barat, dan Nusa Tenggara Timur.",
            "Kabupaten Tana Toraja adalah kabupaten di Provinsi Sulawesi Selatan, dengan bupati bernama Ir. Nico Biringkanae. Ibu kota kabupaten ini adalah Makale. Sebelum pemekaran, kabupaten ini memiliki luas wilayah 3.203 km². Suku Toraja yang mendiami daerah pegunungan dan mempertahankan gaya hidup yang khas dan masih menunjukkan gaya hidup Austronesia yang asli dan mirip dengan budaya Nias. Daerah ini merupakan salah satu objek wisata di Sulawesi Selatan.",
            "Gunung Bromo (dari bahasa Sanskerta: Brahma, salah seorang Dewa Utama dalam agama Hindu) atau dalam bahasa Tengger dieja \"Brama\", adalah sebuah gunung berapi aktif di Jawa Timur, Indonesia. Gunung ini memiliki ketinggian 2.329 meter di atas permukaan laut dan berada dalam empat wilayah kabupaten, yakni Kabupaten Probolinggo, Kabupaten Pasuruan, Kabupaten Lumajang, dan Kabupaten Malang. Gunung Bromo terkenal sebagai objek wisata utama di Jawa Timur. Sebagai sebuah objek wisata, Bromo menjadi menarik karena statusnya sebagai gunung berapi yang masih aktif. Gunung Bromo termasuk dalam kawasan Taman Nasional Bromo Tengger Semeru.",
            "Ngarai Sianok di Bukittinggi menjadi salah satu destinasi wisata di Indonesia yang tetap jadi favorit di 2019. Menjadi salah satu kebanggaan warga Sumatra Barat, Ngarai Sianok tampil cantik dengan bentang alamnya berupa lembah sempit dan bukit bertebing curam.Di bagian tengah lembah, mengalir sebuah sungai kecil. Keberadaannya menambah cantik pemandangan yang ada di sini. Suasananya tenang sehingga cocok sekali untuk siapa pun yang sedang butuh menenangkan diri."


    };
    private static int[] poto = {
        R.drawable.raja_ampat,
            R.drawable.pulau_komodo,
            R.drawable.candi_borobudur,
            R.drawable.danau_toba,
            R.drawable.yogyakarta,
            R.drawable.lombok,
            R.drawable.bali,
            R.drawable.tana_toraja,
            R.drawable.bromo,
            R.drawable.ngarai_sianok
    };

    static ArrayList<konten> getListData(){
        ArrayList<konten> lisKonten = new ArrayList<>();
        for (int i = 0; i <judul.length; i++){
            konten konten = new konten();
            konten.setJudul(judul[i]);
            konten.setKeterangan(deskripsi[i]);
            konten.setPoto(poto[i]);
            lisKonten.add(konten);
        }
        return lisKonten;
    }
}
