package com.rehan.klinik.model

import com.rehan.klinik.R

data class ModelListDoctors(
    var imgDoctor : Int,
    var namaDoctor : String,
    var SpesDoctor : String,
    var JumlahReview : String,
    val angkaRating : String
)

object ListDoctor{
    fun getModel() : List<ModelListDoctors>{
        val item1 = ModelListDoctors(
            R.drawable.dokter1,
            "Dr. Andi Setiawan",
            "Spesialis Jantung",
            "(150)",
            "4.8"
        )
        val item2 = ModelListDoctors(
            R.drawable.dokter2,
            "Dr. Saipudin Hidayat",
            "Spesialis THT",
            "(170)",
            "4.9"
        )
        val item3 = ModelListDoctors(
            R.drawable.dokter3,
            "Dr. Ade Setiawan",
            "Spesialis Hati",
            "(140)",
            "4.7"
        )
        val item4 = ModelListDoctors(
            R.drawable.dokter4,
            "Dr. Rizal Ladiank",
            "Spesialis Bacok",
            "(100)",
            "2.5"
        )
        val item5 = ModelListDoctors(
            R.drawable.dokter5,
            "Dr. Rina Hartini",
            "Spesialis Paru-paru",
            "(150)",
            "4.8"
        )

        val itemList : ArrayList<ModelListDoctors> = ArrayList()
        itemList.add(item1)
        itemList.add(item2)
        itemList.add(item3)
        itemList.add(item4)
        itemList.add(item5)

        return itemList
    }
}
