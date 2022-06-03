package com.ashlesh.fluffies.data

import com.ashlesh.fluffies.R
import com.ashlesh.fluffies.model.Cat
import com.ashlesh.fluffies.model.Owner

object FakeCatDatabase {
    val owner =
        Owner("Dr Sheldon Cooper", "B.S., M.S., MA, Ph.D., and Sc.D., OMG RIGHT!", R.drawable.owner)
    val catList = listOf(
        Cat(
            1,
            "Enrico Fermi",
            2.0,
            "Male",
            "white",
            7.2,
            "850 m",
            R.drawable.cat1,
            "Named after the creator of the world's first nuclear reactor",
            owner
        ),
        Cat(
            2,
            "Richard Feynman",
            1.3,
            "Female",
            "black",
            5.3,
            "890 m",
            R.drawable.cat2,
            "Named after American theoretical physicist, known for his work in the path integral formulation of quantum mechanics",
            owner
        ),
        Cat(
            3,
            "Edward Teller",
            2.6,
            "Male",
            "black",
            8.3,
            "790 m",
            R.drawable.cat3,
            "The father of the hydrogen bomb who loves his saucer of milk",
            owner
        ),
        Cat(
            4,
            "Otto Frisch",
            1.2,
            "Male",
            "colorful",
            3.3,
            "700 m",
            R.drawable.cat4,
            "Gave the first theoretical explanation of nuclear fission",
            owner
        ),
        Cat(
            5,
            "Panofsky,",
            4.1,
            "Female",
            "brown",
            4.3,
            "390 m",
            R.drawable.cat5,
            "German-American physicist",
            owner
        ),
        Cat(
            6,
            "Zazzles",
            0.7,
            "Male",
            "yellow",
            2.3,
            "290 m",
            R.drawable.cat6,
            "Initially named Hermann von Helmholtz but I'm too Zazzy!",
            owner
        )
    )

}