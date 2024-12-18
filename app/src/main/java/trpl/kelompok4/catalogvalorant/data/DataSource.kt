package trpl.kelompok4.catalogvalorant.data

import trpl.kelompok4.catalogvalorant.R
import trpl.kelompok4.catalogvalorant.model.Agent
import trpl.kelompok4.catalogvalorant.model.Weapon
import trpl.kelompok4.catalogvalorant.model.Map

object ValorantDataSource {

    fun getAgents(): List<Agent> {
        return listOf(
            Agent("Jett", "Duelist dari Korea Selatan yang lincah dan berbahaya dengan kemampuan angin untuk mengendalikan pergerakan dan menyerang musuh.", R.drawable.jett),
            Agent("Phoenix", "Duelist dari Inggris yang memanfaatkan api untuk menyerang musuh sekaligus menyembuhkan dirinya sendiri.", R.drawable.phoenix),
            Agent("Sage", "Sentinel dari Tiongkok yang menjadi penyembuh tim, mampu menghidupkan rekan yang gugur dan menciptakan dinding es untuk menghambat musuh.", R.drawable.sage),
            Agent("Reyna", "Duelist dari Meksiko yang mendapatkan kekuatan dari musuh yang dia kalahkan, meningkatkan daya tempurnya di medan perang.", R.drawable.reyna),
            Agent("Raze", "Duelist dari Brasil dengan ledakan dahsyat, senjata-senjata inovatif, dan gaya bermain yang agresif.", R.drawable.raze),
            Agent("Killjoy", "Sentinel dari Jerman yang menggunakan teknologi canggih untuk mengendalikan area dan mengalahkan musuh dengan jebakan yang mematikan.", R.drawable.killjoy)
        )
    }

    fun getWeapons(): List<Weapon> {
        return listOf(
            Weapon("Vandal", "Senjata serbu dengan akurasi tinggi dan kerusakan besar, cocok untuk pertempuran jarak menengah hingga jauh.", R.drawable.vandal),
            Weapon("Phantom", "Senjata serbu dengan suara lebih senyap dan stabil untuk pertempuran jarak menengah.", R.drawable.phantom),
            Weapon("Operator", "Senapan sniper dengan kerusakan sangat tinggi, mampu membunuh dengan satu tembakan.", R.drawable.operator),
            Weapon("Marshal", "Senapan sniper ekonomis dengan kerusakan besar tetapi kurang stabil dibandingkan Operator.", R.drawable.marshal),
            Weapon("Spectre", "SMG cepat dengan akurasi tinggi saat bergerak, ideal untuk jarak dekat.", R.drawable.spectre)
        )
    }

    fun getMaps(): List<Map> {
        return listOf(
            Map("Haven", "Map unik dengan tiga spike sites, memberikan banyak opsi strategi bagi tim.", R.drawable.haven),
            Map("Bind", "Map dengan dua spike sites yang memiliki teleport unik untuk rotasi cepat.", R.drawable.bind),
            Map("Split", "Map dengan high-ground strategis dan jalur choke point sempit, cocok untuk taktik bertahan.", R.drawable.split),
            Map("Ascent", "Map dengan mekanik pintu yang dapat ditutup untuk menghalangi musuh.", R.drawable.ascent),
            Map("Icebox", "Map dengan banyak vertikalitas dan zipline untuk mobilitas tinggi.", R.drawable.icebox)
        )
    }
}
