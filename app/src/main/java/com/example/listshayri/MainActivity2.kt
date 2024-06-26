package com.example.listshayri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {


    lateinit var txt: TextView
    lateinit var click: ListView

    var morning = arrayOf(
        "अर्ज किया है,\n" +
                "चाय के कप से उठते धुए में तेरी सकल नजर आती है,\n" +
                "ऐसे खो जाते है तेरे खयालों में कि,\n" +
                "अकसर मेरी चाय ठंडी हो जाती है…...!!!\n" +
                "\"सुप्रभात\"",
        "ना किसी के आभाव में जियो,\n" +
                "ना किसी के प्रभाव में जियो,\n" +
                "ज़िन्दगी आपकी है बस अपने, \n" +
                "मस्त स्वभाव में जियो..........!!!\n" +
                "\"सुप्रभात\"",
        "ताज़ी हवा में फूलो की महक हो,\n" +
                "पहली किरण में चिडियों की चहक हो,\n" +
                "जब भी खोलो तुम अपनी पलके,\n" +
                "उन पलकों में बस खुशियों की झलक हो…..!!!\n" +
                "\"Have A Beautiful Day\"",
        "हर सुबह तेरी मुस्कुराती रहे,\n" +
                "हर शाम तेरी गुनगुनाती रहें,\n" +
                "मेरी दुआ हैं की तू जिस भी मिलें,\n" +
                "हर मिलने वाले को तेरी याद सताती रहें…...!!!\n" +
                "\"सुप्रभात\""
    )

    var Night = arrayOf(
        "हो चुकी रात अब सो भी जाइए\n" +
                "जो हैं दिल के करीब उनके ख्यालों में खो जाइए\n" +
                "कर रहा होगा कोई इंतज़ार आपका\n" +
                "ख़्वाबों में ही सही उनसे मिल तो आइये",
        "सोते हुए को जगाएंगे हम,\n" +
                "आप की नींदे चुराएंगे हम,\n" +
                "हर वक्त SMS करके सताएंगे हम,\n" +
                "आप को आएगा गुस्सा लेकीन,\n" +
                "उस गुस्से मे ही याद तो आएंगे हम।",
        "आकाश के तारों मे खोया है जहाँ सारा,\n" +
                "लगता है प्यारा एक एक तारा,\n" +
                "उन तारों मे सबसे प्यारा है एक सितारा,\n" +
                "जो इस वक्त पढ रहा है SMS हमारा।",
        "आप मेरे सपनों की रानी हैं,\n" +
                "एकमात्र जिसे मैं हर रात\n" +
                "अपने सपनों में देखना चाहता हूं।\n" +
                "तुम्हारी रात अच्छी बीते। शुभ रात्रि।\n" +
                "\n"
    )
    var funny = arrayOf(
        "हम उसके इश्क में\n" +
                "इस कदर चोट खाए हुए हैं,\n" +
                "कल उसके बाप ने मारा था\n" +
                "आज भाई आये हुए हैं",
        "मुस्कुराना तो हर लड़की की अदा है,\n" +
                "मुस्कुराना तो हर लड़की की अदा है,\n" +
                "उसे जो मोहब्बत समझे,\n" +
                "वो सबसे बड़ा गधा है।",
        "फूल है गुलाब का,\n" +
                "नशा है शराब का,\n" +
                "हमारा तो कट गया\n" +
                "अब कटेगा आपका।",
        "जो मुश्किल से मिले वो है खुशी,\n" +
                "जो किसी किसी को मिले वो है प्यार,\n" +
                "जो सबको मिले वो है गम,\n" +
                "जो नसीब वालों को मिले वो हैं हम।"
    )
    var bday = arrayOf(
        "“जन्मदिन के ये खास लम्हे मुबारक,\n" +
                "आखो में बसे नए ख्वाब मुबारक,\n" +
                "जिंदगी जो लेकर आई है, आपके लिए आज,\n" +
                "वो तमाम खुशियो की हसी सौगात मुबारक हो..!!\n" +
                "“HAPPY BIRTHDAY”",
        "फूलों ने अमृत का जाम आपको भेजा है,\n" +
                "सूरज ने गगन से सलाम आपको भेजा है,\n" +
                "मुबारक हो आपको नया जन्मदिन,\n" +
                "तहे-दिल से हमने ये पैगाम भेजा है।\n" +
                "।। HAPPY BIRTHDAY BEAUTIFUL ।।",
        "खुसी से हमेसा बीते तुम्हारा ये हर दिन\n" +
                "हर सुहानी रात हो,\n" +
                "जिस तरफ कदम आपके पड़े,\n" +
                "वहा फूलो की बरसात हो.\n" +
                "।। जन्मदिन मुबारक हो आपको ।।",
        "सिर्फ तू ही नही,\n" +
                "तेरा जन्मदिन भी खास है पगली…!"
    )
    var friend = arrayOf(
        "ज़िन्दगी हर पल कुछ खास नहीं होती,\n" +
                "फूलों की खुशबू हमेशा पास नहीं होती,\n" +
                "मिलना हमारी तक़दीर में था वरना,\n" +
                "इतनी प्यारी दोस्ती इत्तेफाक नहीं होती।\n",
        "यार हर मुखड़े की चमकान होती है,\n" +
                "यारी ही सुख-दुःख की पहचान होती है,\n" +
                "कोई रूठ भी जाये तो दिल पे मत लेना,\n" +
                "क्योंकि दोस्ती जरा-सी नादान होती है.",
        "ताज़ी हवा में फूलों की महक हो,\n" +
                "पहली किरण में चिड़ियो की चहक हो,\n" +
                "जब भी आप अपनी पल्खें खोलो,\n" +
                "उन पलखो में खुशियों की झलक हो.",
        "जब दोस्ती सच्ची और मजबूत होती है,\n" +
                "तो उसे जताने की ज़रूरत नही होती है,\n" +
                "चाहे दोस्त कितना भी दूर चला जाये,\n" +
                "उसे पास लाने की ज़रूरत नही होती है."
    )
    var Attitude = arrayOf(
        "जिन्दगी अपनी है तो,\n" +
                "अंदाज भी अपना ही होगा न !",
        "हम दुश्मनों को भी बड़ी शानदार सजा देते हैं,\n" +
                "हात नहीं उठाते बस नजरों से गिरा देते हैं !",
        "यहाँ किसकी मजाल है जो छेड़े दिलेर को,\n" +
                "गर्दिश में तो कुत्ते भी घेर लेते हैं शेर को !",
        "मेरे जो दोस्त है उनके लिए में ताकत हूँ\n" +
                "और जो मेरे दुश्मन है उनके लिए बहुत बड़ा आफत हूँ !"
    )
    var Romantic = arrayOf(
        "लोग तो मरते हैं हुस्न पर\n" +
                "मेरा दिल तो तेरी गुफ्तगू पर मरता है",
        "लाजमी है तेरा खुदपर गुरुर करना,\n" +
                "हम जिसे चाहे वो मामूली हो भी नही सकता…!",
        "मेरा हो जा मुझे-ए-यार मुकम्मल कर दे,\n" +
                "या मुझे छोड़ दे इनकार मुकम्मल कर दे,\n" +
                "तू जो खुश है तो यही बात मुझे काफी है,\n" +
                "जीत जा मुझसे मेरी हार मुकम्मल कर दे…!",
        "उजाले अपनी यादों के हमारे साथ रहने दो \n" +
                "न जाने किस गली में ज़िंदगी की शाम हो जाए "
    )
    var newyear = arrayOf(
        "जैसे जैसे नया साल खिलता जाए\n" +
                "आशा है आपकी हर इच्छा पूरी होती जाए।\n" +
                "नया साल मुबारक",
        "हर साल आता है, हर साल जाता है\n" +
                "इस साल आपको वो सब मिले\n" +
                "जो आपका दिल चाहता है।",
        "दुख का एक लम्हा भी आपके पास न आए\n" +
                "दुआ है मेरी कि ये साल आपके लिए खास बन जाए",
        "नए रंग हों नयी उमंगें, आंखों में उल्लास नया,\n" +
                "नए गगन को छू लेने का मन में हो विश्वास नया।\n" +
                "नया साल मुबारक"
    )
    var kite = arrayOf(
        "ख्वाहिशों की पतंग को,\n" +
                "उम्मीदों की उड़ान दो,\n" +
                "हौसलों की हवा लगे\n" +
                "उसे छू लेने आसमान दो.",
        "यादगार खुशियाँ तो बचपन की होती है,\n" +
                "जवानी में हर कोई चुनौतियों से तंग होता है,\n" +
                "यहाँ सबसे ऊपर उठने का जंग होता है\n" +
                "हकीकत में जिंदगी इक पतंग होता है.",
        "जब प्रेमी पतंग और प्रेमिका डोर हो जाती है,\n" +
                "जिंदगी खुशियों के रंगों में सराबोर हो जाती है.",
        "पतंग को आकाश में अच्छी तरह से उड़ने\n" +
                "के लिए धाँगे से बांधना पड़ता है.\n" +
                "ठीक उसी प्रकार स्वतंत्रता के साथ थोड़े\n" +
                "नियम और प्रतिबन्ध जरूरी होते है."
    )
    var sad = arrayOf(
        "काश तू पूछे मुझसे मेरा हाल-ए-दिल,\n" +
                "मैं तुझे भी रुला दू तेरे सितम सुना सुना कर…!",
        "शहर ज़ालिमों का है साहब, जरा संभल कर चलना,\n" +
                "यहां सीने से लगाकर, लोग दिल निकाल लेते है…!",
        "ना है कोई है नही तुम्हारे पास मन बहलाने को,\n" +
                "कहो तो भेज दू अपना दिल फिर से दुखाने को…!",
        "हमने सोचा था बताएँगे दिल का\n" +
                "दर्द तुझको पर तुमने तो इतना भी न पूछा\n" +
                "ख़ामोश क्यों हो तुम ..!!"
    )
    var yad = arrayOf(
        "दिल को छू जाती है ये रात की आवाज,\n" +
                "चौंक उठते हैं कहीं तूने पुकारा तो नहीं !",
        "तुम्हारे बाद किसी को दिल में बसाया नहीं हमने,\n" +
                "तुम चले गए तो क्या,\n" +
                "यादों को मिटाया नहीं हमने !",
        "तुम्हारी याद के जब ज़ख़्म भरने लगते हैं \n" +
                "किसी बहाने तुम्हें याद करने लगते हैं ",
        "ये हिजरतें हैं ज़मीन ओ ज़माँ से आगे की \n" +
                "जो जा चुका है उसे लौट कर नहीं आना"
    )
    var navratri = arrayOf(
        "दुर्गा परम सनातनी जग की सृजनहार,\n" +
                "आदि भवानी महा देवी श्रृष्टि का आधार.\n" +
                "शुभ नवरात्रि",
        "शेरों वाली मैया के दरबार में दुःख -दर्द मिटाये जाते हैं,\n" +
                "जो भी दर पर आते है .. शरण में लिए जाते हैं..\n" +
                "जय माता दी",
        "जाओ सभी, की आज जगरात्रि हैं,\n" +
                "माँ सुनेंगी हर पुकार, की आज नवरात्रि हैं..",
        "शेर पर सवार होकर, खुशियों का वरदान लेकर\n" +
                "हर घर में विराजी अंबे मां, हम सबकी जगदंबे मां !\n" +
                "नवरात्रि की हार्दिक शुभकामनाएं !"
    )
    var Diwali = arrayOf(
        "प्यार की बंसी बजे,\n" +
                "प्यार की बजे शहनाई.\n" +
                "खुशियों के दीप जले,\n" +
                "दुख कभी न ले अंगड़ाई।\n" +
                "शुभ दीपावली।।",
        "दीपों का ये पावन त्योहार,\n" +
                "आपके लिए लाये खुशियां हजार,\n" +
                "लक्ष्मी जी विराजें आपके द्वार,\n" +
                "हमारी शुभकामनाएं करें स्वीकार।\n",
        "आया-आया दिवाली का त्योहार लाया\n" +
                "संग अपने खुशियों की सौगात लाया\n" +
                "दीपावली के पावन पर्व पर आपकी हर मनोकामना पूरी हो।",
        "सर्वज्ञे सर्ववरदे सर्वदुष्टभयंकरि।\n" +
                "सर्वदुःखहरे देवि महालक्ष्मि नमोऽस्तुते ।।\n" +
                "माता लक्ष्मी आपके सब कष्ट हरें।\n" +
                "शुभ दीपावली।।"
    )
    var God = arrayOf(
        " ईश्वर पर आप तभी\n" +
                "विश्वास कर सकते है\n" +
                "जब आपको खुद पर विश्वास हो\n" +
                "क्योंकि ईश्वर बहार नही हमारे अंदर ही है….!!!",
        " जो कुछ है तेरे दिल में,\n" +
                "सब कुछ उसको खबर है,\n" +
                "बंदे तेरे हर हाल पर\n" +
                "भगवान की नजर है…!!!",
        "ईश्वर पर आप तभी विश्वास कर सकते हैं,\n" +
                "जब आपको खुद पर विश्वास हो क्योकिईश्वर बाहर नही हमारे अंदर ही हैं!!",
        "कामयाबी के दरवाजे उन्हीं के लिए खुलते हैं,\n" +
                "जो उन्हें खटखटाने की ताकत रखते हैं…!!"
    )
    var other = arrayOf(
        "जब कभी फुर्सत मिले मेरे दिल का बोझ उतार दो,\n" +
                "मैं बहुत दिनों से उदास हूँ मुझे कोई शाम उधार दो !",
        "ये दरिया-ए-इश्क है, कदम जरा सोच के रखना,\n" +
                "इस में उतर कर किसी को किनारा नहीं मिला !",
        "और भी दुख हैं ज़माने में मोहब्बत के सिवा \n" +
                "राहतें और भी हैं वस्ल की राहत के सिवा ",
        "बड़े लोगों से मिलने में हमेशा फ़ासला रखना \n" +
                "जहाँ दरिया समुंदर से मिला दरिया नहीं रहता "
    )
    var motivitional = arrayOf(
        "काम करो ऐसा कि एक पहचान बन जाए,\n" +
                "हर कदम ऐसा चलो कि निशान बन जाए,\n" +
                "यहां जिंदगी तो हर कोई काट लेता है,\n" +
                "जिंदगी जियो इस कदर कि मिसाल बन जाए।",
        "ये जिंदगी हसीं है इससे प्यार करो,\n" +
                "अभी है रात तो सुबह का इंतजार करो,\n" +
                "वो पल भी आएगा जिसकी ख्वाहिश है आपको,\n" +
                "रब पर रखो भरोसा वक्त पर एतबार करो।",
        "मंजिलें क्या है, रास्ता क्या है?\n" +
                "हौसला हो तो फासला क्या है",
        "उड़ान तो भरनी ही हैं\n" +
                "चाहे कितनी बार गिरना पड़े।\n" +
                "सपने तो पूरे करने ही हैं,\n" +
                "चाहे रातों की नींद कम करनी पड़े।"
    )

    var blank = arrayOf<String>("")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        txt = findViewById(R.id.txt)
        click = findViewById(R.id.click)

        var position = intent.getIntExtra("pos", 0)

        if (position == 0) {
            blank = morning
        } else if (position == 1) {
            blank = Night
        } else if (position == 2) {
            blank = funny
        } else if (position == 3) {
            blank = bday
        } else if (position == 4) {
            blank = friend
        } else if (position == 5) {
            blank = Attitude
        } else if (position == 6) {
            blank = Romantic
        } else if (position == 7) {
            blank = newyear
        } else if (position == 8) {
            blank = kite
        } else if (position == 9) {
            blank = sad
        } else if (position == 10) {
            blank = yad
        } else if (position == 11) {
            blank = navratri
        } else if (position == 12) {
            blank = Diwali
        } else if (position == 13) {
            blank = God
        } else if (position == 14) {
            blank = other
        } else if (position == 15) {
            blank = motivitional
        }
//        var adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, blank)


//        var car = arrayOf(R.drawable.copy,R.drawable.copy)
        var adapter= MyBaseadapter2(this,blank)
        click.adapter = adapter

        click.setOnItemClickListener { adapterView, view, i, l ->

            var intent =
                Intent(this@MainActivity2, MainActivity3::class.java).putExtra("array", blank).putExtra("pos",i)
            startActivity(intent)

        }


        var ttt = intent.getStringExtra("value")

        txt.setText(ttt)

    }
}