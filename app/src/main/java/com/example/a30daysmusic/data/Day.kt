package com.example.a30daysmusic.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.a30daysmusic.R

data class Day(

    @StringRes val stringGenreResourceId: Int,
    @DrawableRes val imageResourceId: Int,
    @StringRes val stringArtistNameResourceId: Int,
    @StringRes val stringSongResourceId: Int,
    @StringRes val stringDescriprionResourceId: Int,
    @DrawableRes val flagResourceId: Int

)

val days = listOf(


    Day(R.string.genre_kpop, R.drawable.photo_1, R.string.artist_blackpink, R.string.song_shut_down, R.string.Description1, R.drawable.kr ),
    Day(R.string.genre_rock_alt, R.drawable.photo_2, R.string.artist_dora_gaitanovici, R.string.song_ana, R.string.Description2, R.drawable.ro),
    Day(R.string.genre_indie_rock, R.drawable.photo_3, R.string.artist_arctic_monkeys, R.string.song_do_i_wanna_know, R.string.Description3, R.drawable.gb),
    Day(R.string.genre_pop, R.drawable.photo_4, R.string.artist_irina_rimes, R.string.song_nu_stii_tu_sa_fii_barbat, R.string.Description4, R.drawable.ro),
    Day(R.string.genre_rap, R.drawable.photo00_5, R.string.artist_kendrick_lamar, R.string.song_humble, R.string.Description5,R.drawable.us),
    Day(R.string.genre_trap, R.drawable.photo_6, R.string.artist_ian, R.string.song_bag_un_blunt, R.string.Description6, R.drawable.ro),
    Day(R.string.genre_jazz, R.drawable.photo_7, R.string.artist_diana_krall, R.string.song_the_look_of_love, R.string.Description7, R.drawable.ca),
    Day(R.string.genre_folk, R.drawable.photo_8, R.string.artist_nicu_alifantis, R.string.song_ce_bine_ca_esti, R.string.Description8, R.drawable.ro),
    Day(R.string.genre_classical_cross, R.drawable.photo_9, R.string.artist_andre_rieu, R.string.song_the_second_waltz, R.string.Description9, R.drawable.nl),
    Day(R.string.genre_rnb, R.drawable.photo_10, R.string.artist_the_weeknd, R.string.song_blinding_lights, R.string.Description10, R.drawable.ca),
    Day(R.string.genre_soul, R.drawable.photo_11, R.string.artist_aretha_franklin, R.string.song_think, R.string.Description11, R.drawable.us),
    Day(R.string.genre_funk, R.drawable.photooooo_12, R.string.artist_vama_veche, R.string.song_am_sa_ma_intorc_la_tine, R.string.Description12, R.drawable.ro),
    Day(R.string.genre_reggaeton, R.drawable.photo_13, R.string.artist_j_balvin, R.string.song_mi_gente, R.string.Description13, R.drawable.co),
    Day(R.string.genre_reggae, R.drawable.photo_14, R.string.artist_bob_marley, R.string.song_the_look_of_love, R.string.Description14, R.drawable.jm),
    Day(R.string.genre_electronic, R.drawable.photo_15, R.string.artist_moonlight_breakfast, R.string.song_shout, R.string.Description15, R.drawable.ro),
    Day(R.string.genre_ambient, R.drawable.photo_16, R.string.artist_brian_eno, R.string.song_an_ending_ascent, R.string.Description16, R.drawable.gb),
    Day(R.string.genre_rock, R.drawable.photo_17, R.string.artist_vita_de_vie, R.string.song_varza, R.string.Description17, R.drawable.ro),
    Day(R.string.genre_disco, R.drawable.photo_18, R.string.artist_bee_gees, R.string.song_night_fever, R.string.Description18, R.drawable.gb),
    Day(R.string.genre_house, R.drawable.photo_19, R.string.artist_inna, R.string.song_up, R.string.Description19, R.drawable.ro),
    Day(R.string.genre_grunge, R.drawable.photo_20, R.string.artist_nirvana, R.string.song_come_as_you_are, R.string.Description20, R.drawable.us),
    Day(R.string.genre_punk, R.drawable.photo_21, R.string.artist_the_offspring, R.string.song_the_kids_arent_alright, R.string.Description21, R.drawable.us),
    Day(R.string.genre_pop_rock, R.drawable.photo_22, R.string.artist_dan_bittman, R.string.song_ingerii_demoni, R.string.Description22, R.drawable.ro),
    Day(R.string.genre_world, R.drawable.photo_23, R.string.artist_fanfare_ciocarlia, R.string.song_lume_lume, R.string.Description23, R.drawable.ro),
    Day(R.string.genre_trance, R.drawable.photo_24, R.string.artist_armin_van_buuren, R.string.song_this_is_what_it_feels_like, R.string.Description24 ,R.drawable.nl),
    Day(R.string.genre_trip_hop, R.drawable.photo_25, R.string.artist_massive_attack, R.string.song_teardrop, R.string.Description25, R.drawable.gb),
    Day(R.string.genre_blues, R.drawable.photo_26, R.string.artist_bb_king, R.string.song_sweet_little_angel, R.string.Description26,R.drawable.us),
    Day(R.string.genre_experimental, R.drawable.photo_27, R.string.artist_silent_strike, R.string.song_time, R.string.Description27, R.drawable.ro),
    Day(R.string.genre_pop_electronic, R.drawable.photo_28, R.string.artist_dua_lipa, R.string.song_levitating, R.string.Description28, R.drawable.gb),
    Day(R.string.genre_balkan, R.drawable.photo_29, R.string.artist_mahala_rai_banda, R.string.song_mahalageasca, R.string.Description29, R.drawable.ro),
    Day(R.string.genre_cover, R.drawable.photo_30, R.string.artist_andra, R.string.song_iubirea_schimba_tot_acoustic, R.string.Description30, R.drawable.ro)





)