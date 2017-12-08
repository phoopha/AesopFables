package com.example.emergencyphonenumber.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Promlert on 2017-11-26.
 */

public class TaleDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "tale.db";
    private static final int DATABASE_VERSION = 15;

    public static final String TABLE_NAME = "tale_story";
    public static final String COL_ID = "_id";
    public static final String COL_TITLE = "title";
    public static final String COL_STORY = "story";
    public static final String COL_PICTURE = "picture";

    private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + "("
            + COL_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
            + COL_TITLE + " TEXT, "
            + COL_STORY + " TEXT, "
            + COL_PICTURE + " TEXT)";

    public TaleDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
        insertInitialData(db);
    }

    private void insertInitialData(SQLiteDatabase db) {
        ContentValues cv = new ContentValues();
        cv.put(COL_TITLE, "เศรษฐีกับหงส์");
        cv.put(COL_STORY, "       เศรษฐีได้ยินเรื่องร่ำลือว่ามีหงส์ทีร้องเพลงได้ไพเราะมากอยู่ตัวหนึ่ง เขาจึงไปซื้อหงส์ตัวนั้น เพื่อที่จะให้มันร้องเพลงให้แขกฟังในงานวันเกิดของเขา  แต่พอถึงวันงานเจ้าหงส์กลับไม่ยอมเปล่งเสียงออกมาแม้แต่น้อย ทำให้เศรษฐีขายหน้าและโกรธเป็นอย่างมาก หลายวันต่อมาเขาจึงสั่งคนรับใช้ให้ฆ่าหงส์เสีย เมื่อหงส์ได้ยินเช่นนั้นมันจึงส่งเสียงร้องออกมาอย่างเศร้าสร้อย เพราะว่านี่คงเป็นเพลงสุดท้ายแล้วที่มันจะได้ร้องก่อนตาย\n" +
                " \n" +
                ":: นิทานเรื่องนี้สอนให้รู้ว่า ::\n" +
                "ถ้าไม่รู้จักทำตัวให้เป็นประโยชน์ ก็ไม่มีใครเขาต้องการ");
        cv.put(COL_PICTURE, "Aesop0001.jpg");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_TITLE, "ไก่กับพลอย");
        cv.put(COL_STORY, "       ณ ฟาร์มแห่งหนึ่ง ขณะที่ไก่ตัวหนึ่งกำลังคุ้ยเขี่ยอาหารอยู่นั้น มันก็ได้พบกับพลอยล้ำค่าเม็ดหนึ่ง เจ้าไก่มองดูพลอยเม็ดนั้นแล้วเอ่ยขึ้นว่า \"เจ้านี่ช่างงดงามเหลือเกิน เจ้าอาจจะมีค่ามากสำหรับมนุษย์ แต่สำหรับข้าเจ้าไม่มีค่าเลยแม้แต่น้อย เพราะข้าต้องการเพียงแค่เมล็ดข้าวที่จะทำให้ข้าอิ่มและมีชีวิตรอดต่อไปได้แค่นั้น\"\n" +
                " \n" +
                ":: นิทานเรื่องนี้สอนให้รู้ว่า ::\n" +
                "ของทีค่าหากอยู่ในมือของคนที่ไม่ได้ใช้ก็เปล่าประโยชน์");
        cv.put(COL_PICTURE, "Aesop0002.jpg");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_TITLE, "ลูกแกะโง่");
        cv.put(COL_STORY, "       ลูกแกะตัวหนึ่งเดินหลงฝูงพลัดตกลงไปในบ่อน้ำมัน กว่ามันจะขึ้นมาจากบ่อได้ ขนของมันก็เปียกชุ่มไปด้วยน้ำมันหมดแล้ว  ขณะที่มันกำลังเดินกลับไปหาฝูง ประกายไฟจากคบเพลิงที่มีคนจุดทิ้งไว้ก็กระเด็นมาติดที่ขนของมัน เกิดเป็นลูกไฟเล็ก ๆ มันเที่ยววิ่งไปอวดแกะตัวอื่น ๆ ว่า \"ไฟบนตัวข้ามันให้แสงสว่างมากกว่าดวงอาทิตย์เสียอีก\" ทันใดนั้นลมพัดแรงขึ้นทำให้ลูกไฟบนตัวมันลุกโชนขึ้นอย่างรวดเร็ว ลูกแกะจึงถูกไฟคลอกตาย เมื่อเจ้าของมาเห็นร่างของมันขึงพูดขึ้นว่า \"ชาติหน้าเจ้าจงไปเกิดเป็นดาวลูกแกะแล้วกันนะ จะได้มีแสงสว่างในตัวเองสมใจ\"\n" +
                " \n" +
                ":: นิทานเรื่องนี้สอนให้รู้ว่า ::\n" +
                "อย่าเห็นกงจักรเป็นดอกบัว เพราะมันจะเป็นภัยร้ายต่อตัวเองในภายหลัง");
        cv.put(COL_PICTURE, "Aesop0004.jpg");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_TITLE, "ชายชรากับมัจจุราช");
        cv.put(COL_STORY, "       ชายชราคนหนึ่งมีอาชีพรับจ้างตัดฟืน ด้วยหลังที่งองุ้มและโรคภัยที่รุมเร้าทำให้เขาเริ่มไม่มีเรี่ยวแรงในการทำงานเลี้ยงดูตัวเองอีกต่อไป เขารู้สึกท้อแท้สิ้นหวังจึงร้องขึ้นมาว่า \"ข้าไม่อยากมีชีวิตอยู่ต่อไปอีกแล้ว ท่านมัจจุราช ช่วยมารับข้าไปทีเถิด\" พูดจบมัจจุราชก็ปรากฎตัวขึ้นแล้วพูดกับชายชราว่า \"เจ้าเรียกข้ามา เจ้าต้องการอะไรหรือ\" ชายชราเกิดกลัวตายขึ้นมาจึงรีบตอบกลับไปว่า \"ได้โปรดช่วยยกฟืนใส่บ่าให้ข้าทีสิท่าน\"\n" +
                " \n" +
                ":: นิทานเรื่องนี้สอนให้รู้ว่า ::\n" +
                "คงไม่เป็นการดีหากเราได้ทุกสิ่งที่ปรารถนา");
        cv.put(COL_PICTURE, "Aesop0003.jpg");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_TITLE, "แม่ไก่ตาบอด");
        cv.put(COL_STORY, "       ณ บ้านหลังหนึ่ง มีแม่ไก่อาศัยอยู่สองตัว ตัวหนึ่งตาดี ส่วนอีกตัวตาบอดสนิท ในแต่ละวันแม่ไก่ตาบอดจะออกคุ้ยเขี่ยพื้นดิน เพื่อหาอาหารอย่างขยันขันแข็ง ส่วนแม่ไก่ตาดีเอาอต่อยู่เแย ๆ ไม่เคยออกไปไหนไกล เพราะกลัวว่าเท้าอันอ่อนนุ่มทั้งสองข้างจะหยาบกร้าน แม่ไก่ตาดีใช้ชีวิตอย่างสุขสบาย ด้วยการคอยจิกกินผลไม้ที่แม่ไก่ตาบอดเพียรพยายามหามา แต่มันก็ต้องมีชีวิตอยู่อย่างไร้ค่า เพราะไม่สามารถหาเลี้ยงตัวเองได้นั่นเอง \n" +
                " \n" +
                ":: นิทานเรื่องนี้สอนให้รู้ว่า ::\n" +
                "ผู้ที่มีร่างกายพิการหากมีความขยัน ก็มีคุณค่ามากกว่าคนปกติที่ไม่รู้จักทำมาหากิน");
        cv.put(COL_PICTURE, "Aesop0005.jpg");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_TITLE, "แม่ตุ่นกับลูกตุ่น");
        cv.put(COL_STORY, "       แม่ตุ่นตัวหนึ่งเพิ่งคลอดลูกออกมาไม่กี่วัน ลูกตุ่นเพิ่งจะลืมตาจึงมองเห็นอะไรไม่ชัด แต่มันชอบพูดโอ้อวดกับแม่ว่า \"แม่จ๋าหนูมองเห็นแล้วนะ เห็นชัดด้วย\" แม่ตุ่นประหลาดใจและไม่เชื่อว่าลูกจะมองเห็นได้เร็วขนาดนี้ จึงคิดหาวิธีที่จะทดสอบลูกของตน โดยนำกำยานทีมีลักษณะเป็นก้อน ๆ มีกลิ่นฉุนมาทดสอบ เธอวางกำยานตรงหน้าลูกแล้วถามว่า \"ไหนลูกลองบอกแม่ซิว่าสิ่งนี้มันคืออะไร\" ลูกตุ่นมองไม่เห็นและไม่ได้กลิ่น มันจึงตอบมั่ว ๆ ไปว่า \"ก้อนหินไงล่ะจ๊ะแม่\" เมื่อลูกตอบผิด แม่ตุ่นจึงสอนลูกว่า \"ลูกจ๋า นอกจากตาของลูกจะมองเห็นไม่ชัดแล้ว จมูกของลูกก็ยังไม่ได้กลิ่นอีกด้วยนะ ทีหลังอย่าโกหกอีกนะจ๊ะ\"\n" +
                " \n" +
                ":: นิทานเรื่องนี้สอนให้รู้ว่า ::\n" +
                "อย่าพูดโอ้อวดความสามารถเกินจริง");
        cv.put(COL_PICTURE, "Aesop0006.jpg");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_TITLE, "หมาป่ากับสุนัขจิ้งจอก");
        cv.put(COL_STORY, "       หมาป่าตัวหนึ่งกล่าวหาว่าสุนัขจิ้งจอกขโมยของ ของมันไป แต่สุนัขจิ้งจอกยืนยันว่าไม่ได้เอาไป พวกมันเถียงกันอยู่นานไม่มีใครยอมใคร หมาป่าจึงพาลิงให้มาช่วยตัดสินให้ แต่เจ้าลิงก็ตัดสินว่าสุนัขจิ้งจอกของของหมาป่าไปเช่นกัน \"เปล่านะท่าน ข้าไม่ได้ทำจริง ๆ แล้วก็ไม่เคยคิดที่จะทำด้วย\" สุนัขจิ้งจอกครวญ \"หุบปาก เจ้าไม่ค้องมาปฏิเสธเลย\" หมาป่าส่งเสียงขู่ สุนัขจิ้งจอกได้แต่คิดในใจ \"ช่างไม่ยุติธรรมเลย ที่ลิงตัดสินเช่นนั้นก็เพราะว่ากลัวหมาป่าจะกินเอาน่ะสิ\"\n" +
                " \n" +
                ":: นิทานเรื่องนี้สอนให้รู้ว่า ::\n" +
                "ผู้ไม่มัอำนาจย่อมเสียเปรียบผู้มีอำนาจเสมอ");
        cv.put(COL_PICTURE, "Aesop0007.jpg");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_TITLE, "ชายชรากับลา");
        cv.put(COL_STORY, "       ชายชราคนหนึ่งไปซื้อลา เขายืนเลือกอยู่นานแต่ก็เลือกไม่ได้สักที คนขายจึงเสนอให้เขาทดสอบลาก่อนซื้อ เขาจึงเลือกลาตัวหนึ่งแล้วพามันกลับบ้านด้วย เมื่อมาถึงบ้านเขาก็ปล่อยมันไปรวมกับลาตัวอื่น ๆ ในคอก ปรากฏว่าลาตัวนั้นรีบเดินเข้าไปหาลาที่ขี้เกียจที่สุดและตะกละที่สุดทันที ชายชราเห็นเช่นนั้นจึงเอามันกลับไปคืนร้าน พ่อค้าสงสัยจึงถามว่า \"ท่านได้ทดสอบมันแล้วรึ\" ชายชราตอบทันทีว่า \"ไม่ต้องลองข้าก็รู้แล้วว่าเจ้าลาตัวนี้ ต้องมีนิสัยเหมือนกับลาที่มันเลือกเป็นเพื่อนแน่ ๆ\"\n" +
                " \n" +
                " \n" +
                ":: นิทานเรื่องนี้สอนให้รู้ว่า ::\n" +
                "การจะดูว่าใครมีลักษณะนิสัยอย่างไร ให้ดูจากเพื่อนที่เขาคบ");
        cv.put(COL_PICTURE, "Aesop0008.jpg");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_TITLE, "เทวดากับนางฟ้า");
        cv.put(COL_STORY, "       ขณะที่เทวดาองค์หนึ่งกำลังเดินทางท่องเที่ยวอยู่นั้น เขาก็ได้พบสิ่งหนึ่งคล้ายกับผลแอปเปิ้ลวางอยู่บนพื้น เทวดาจึงลองใช้เท้าเหยียบดู แทนที่สิ่งของนั้นจะแหลกละเอียดลงไปกับพื้น มันกลับเป็นขนาดใหญ่ขึ้นเป็นสองเท่า ด้วยความสงสัยเขาจึงเหยียบมันแรงขึ้นอีกพร้อมกัยใช้ไม้ตี แต่มันก็ยังขยายใหญ่ขึ้นเรื่อย ๆ ในที่สุดก็เต็มทางเดิน จากนั้นนางฟ้าก็ปรากฏตัวพร้อมกล่าวว่า \"อย่าประหลาดใจเลย สิ่งที่ท่านเห็นอยู่นั้นเป็นพลังแห่งการต่อสู้นั่นเอง\"\n" +
                " \n" +
                ":: นิทานเรื่องนี้สอนให้รู้ว่า ::\n" +
                "ชัยชนะย่อมเกิดแก่ผู้ที่มีความพยายาม");
        cv.put(COL_PICTURE, "Aesop0009.jpg");
        db.insert(TABLE_NAME, null, cv);

        cv = new ContentValues();
        cv.put(COL_TITLE, "สิงโตกับนักเดินทาง");
        cv.put(COL_STORY, "       ณ ป่าแห่งหนึ่งสิงโตกับนักเดินทางเข้าป่าไปด้วยกัน ระหว่างทางทั้งสองผลัดกันเล่าเรื่องและเกิดการโต้เถียงกัน นักเดินทางกล่าวว่ามนุษย์มีอำนาจและแข็งแรงกว่าสิงโต ฝ่ายสิงโตก็ว่าพวกของมันแข็งแรงและมีกำลังมากกว่า เมื่อทั้งสองเดินผ่านอนุสรณ์สถานแห่งหนึ่ง เป็นรูปปั้นนักรบเหยียบหัวสิงโต ชายหนุ่มจึงพูดขึ้นมาว่า \"เจ้าเห็นไหมว่ามนุษย์น่ะเก่งมากแค่ไหน ที่สามารถสยบสิงโตเจ้าป่าได้\" สิงโตจึงตอบกลับไปว่า \"นั่นเป็นเพราะอนุสรณ์สถานแห่งนี้มนุษย์อย่างเจ้าเป็นผู้สร้างขึ้นมา ถ้าสิงโตสามารถแกะสลักได้ ท่านก็จะได้เห็นรูปปั้นที่มนุษย์อยู่ใต้อุ้งเท้าสิงโตเช่นกัน\"\n" +
                " \n" +
                ":: นิทานเรื่องนี้สอนให้รู้ว่า ::\n" +
                "เรามักมองตนเองดีกว่าผู้อื่นเสมอ");
        cv.put(COL_PICTURE, "Aesop0010.jpg");
        db.insert(TABLE_NAME, null, cv);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}