package com.example.vetrandir.clicker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.ListIterator;

public class Inventory extends AppCompatActivity {
    public int stage = 5;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
        /*ArrayList<ImageView> iv = new ArrayList<>();
        ListIterator it = iv.listIterator();*/
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory);
        getSupportActionBar().hide();

        /*ImageView imageViewShelezo = (ImageView) findViewById(R.id.imageButtonShelezo);
        ImageView imageViewMed = (ImageView) findViewById(R.id.imageButtonMed);
        ImageView imageViewKwarz = (ImageView) findViewById(R.id.imageButtonKwarz);
        ImageView imageViewGraok = (ImageView) findViewById(R.id.imageButtonGraok);*/
        ImageView imageView1 = (ImageView) findViewById(R.id.imageButtonSteklo);
        ImageView imageView2 = (ImageView) findViewById(R.id.imageButtonMedProvoda);
        ImageView imageView3 = (ImageView) findViewById(R.id.imageButtonZhelezPlast);
        ImageView imageView4 = (ImageView) findViewById(R.id.imageButtonLopast);
        ImageView imageView4_1 = (ImageView) findViewById(R.id.imageButtonAntenna);
        ImageView imageView5 = (ImageView) findViewById(R.id.imageButtonTruba);
        ImageView imageView5_1 = (ImageView) findViewById(R.id.imageButtonCorpus);
        ImageView imageView6 = (ImageView) findViewById(R.id.imageButtonBaki);
        ImageView imageView7 = (ImageView) findViewById(R.id.imageButtonEkran);
        ImageView imageView8 = (ImageView) findViewById(R.id.imageButtonChip);
        ImageView imageView9 = (ImageView) findViewById(R.id.imageButtonVtoipovayaPlast);
        ImageView imageView10 = (ImageView) findViewById(R.id.imageButtonProvodka);
        ImageView imageView11 = (ImageView) findViewById(R.id.imageButtonSoplo);
        ImageView imageView12 = (ImageView) findViewById(R.id.imageButtonVint);
        ImageView imageView13 = (ImageView) findViewById(R.id.imageButtonProcessor);
        ImageView imageView14 = (ImageView) findViewById(R.id.imageButtonAccumulator);
        ImageView imageView15 = (ImageView) findViewById(R.id.imageButtonTurbina);
        ImageView imageView16 = (ImageView) findViewById(R.id.imageButtonNasos);
        ImageView imageView17 = (ImageView) findViewById(R.id.imageButtonSolnechnayaPanel);
        ImageView imageView18 = (ImageView) findViewById(R.id.imageButtonSputnikovayaTarelka);
        ImageView imageView19 = (ImageView) findViewById(R.id.imageButtonTransponder);
        ImageView imageView20 = (ImageView) findViewById(R.id.imageButtonObtekatel);
        ImageView imageView21 = (ImageView) findViewById(R.id.imageButtonObshivka);
        ImageView imageView22 = (ImageView) findViewById(R.id.imageButtonComputer);
        ImageView imageView23 = (ImageView) findViewById(R.id.imageButtonTelephon);
        ImageView imageView24 = (ImageView) findViewById(R.id.imageButtonSputnik);
        ImageView imageView24_1 = (ImageView) findViewById(R.id.imageButtonSistemaShizneobespecheniya);
        ImageView imageView24_2 = (ImageView) findViewById(R.id.imageButtonShiloyModul);
        ImageView imageView25 = (ImageView) findViewById(R.id.imageButtonRaketniyUskoritel);
        ImageView imageView26 = (ImageView) findViewById(R.id.imageButtonBortovoyComputer);
        ImageView imageView27 = (ImageView) findViewById(R.id.imageButtonElektrodvigatel);
        ImageView imageView28 = (ImageView) findViewById(R.id.imageButtonMarsochod);
        ImageView imageView29 = (ImageView) findViewById(R.id.imageButtonServer);
        ImageView imageView30 = (ImageView) findViewById(R.id.imageButtonLetaushayaMashina);
        ImageView imageView31 = (ImageView) findViewById(R.id.imageButtonTretyaStupen);
        ImageView imageView32 = (ImageView) findViewById(R.id.imageButtonVtorayaStupen);
        ImageView imageView33 = (ImageView) findViewById(R.id.imageButtonPervayaStupen);
        ImageView imageView34 = (ImageView) findViewById(R.id.imageButtonModulStancii);
        ImageView imageView35 = (ImageView) findViewById(R.id.imageButtonRaketa);
        ImageView imageView36 = (ImageView) findViewById(R.id.imageButtonMeshplanetnayaStanciya);
        ImageView imageView37 = (ImageView) findViewById(R.id.imageButtonMeshplanetnayaStanciya);
        switch (stage){
            case 1:
                imageView1.setImageResource(R.drawable.table_glassnew);
                imageView2.setImageResource(R.drawable.tablemedprov);
                imageView3.setImageResource(R.drawable.iron_platenew);
                imageView4.setImageResource(R.drawable.table_zamok);
                imageView4_1.setImageResource(R.drawable.table_antenna);
                imageView5_1.setImageResource(R.drawable.table_korpus);
                imageView5.setImageResource(R.drawable.table_zamok);
                imageView6.setImageResource(R.drawable.table_zamok);
                imageView7.setImageResource(R.drawable.table_zamok);
                imageView8.setImageResource(R.drawable.table_zamok);
                imageView9.setImageResource(R.drawable.table_zamok);
                imageView10.setImageResource(R.drawable.table_zamok);
                imageView11.setImageResource(R.drawable.table_zamok);
                imageView12.setImageResource(R.drawable.table_zamok);
                imageView13.setImageResource(R.drawable.table_zamok);
                imageView14.setImageResource(R.drawable.table_zamok);
                imageView15.setImageResource(R.drawable.table_zamok);
                imageView16.setImageResource(R.drawable.table_zamok);
                imageView17.setImageResource(R.drawable.table_zamok);
                imageView18.setImageResource(R.drawable.table_zamok);
                imageView19.setImageResource(R.drawable.table_zamok);
                imageView20.setImageResource(R.drawable.table_zamok);
                imageView21.setImageResource(R.drawable.table_zamok);
                imageView22.setImageResource(R.drawable.table_zamok);
                imageView23.setImageResource(R.drawable.table_zamok);
                imageView24.setImageResource(R.drawable.table_zamok);
                imageView24_1.setImageResource(R.drawable.table_zamok);
                imageView24_2.setImageResource(R.drawable.table_zamok);
                imageView25.setImageResource(R.drawable.table_zamok);
                imageView26.setImageResource(R.drawable.table_zamok);
                imageView27.setImageResource(R.drawable.table_zamok);
                imageView28.setImageResource(R.drawable.table_zamok);
                imageView29.setImageResource(R.drawable.table_zamok);
                imageView30.setImageResource(R.drawable.table_zamok);
                imageView31.setImageResource(R.drawable.table_zamok);
                imageView32.setImageResource(R.drawable.table_zamok);
                imageView33.setImageResource(R.drawable.table_zamok);
                imageView34.setImageResource(R.drawable.table_zamok);
                imageView35.setImageResource(R.drawable.table_zamok);
                imageView36.setImageResource(R.drawable.table_zamok);
                imageView37.setImageResource(R.drawable.table_zamok);
                break;
            case 2:
                imageView1.setImageResource(R.drawable.table_glassnew);
                imageView2.setImageResource(R.drawable.tablemedprov);
                imageView3.setImageResource(R.drawable.iron_platenew);
                imageView4.setImageResource(R.drawable.tablelopast);
                imageView4_1.setImageResource(R.drawable.table_antenna);
                imageView5_1.setImageResource(R.drawable.table_korpus);
                imageView5.setImageResource(R.drawable.pipe);
                imageView6.setImageResource(R.drawable.table_bak);
                imageView7.setImageResource(R.drawable.table_screen);
                imageView8.setImageResource(R.drawable.table_chip);
                imageView9.setImageResource(R.drawable.table_vtplast);
                imageView10.setImageResource(R.drawable.wiring);
                imageView11.setImageResource(R.drawable.table_vint);
                imageView12.setImageResource(R.drawable.tozzle);
                imageView13.setImageResource(R.drawable.table_zamok);
                imageView14.setImageResource(R.drawable.table_zamok);
                imageView15.setImageResource(R.drawable.table_zamok);
                imageView16.setImageResource(R.drawable.table_zamok);
                imageView17.setImageResource(R.drawable.table_zamok);
                imageView18.setImageResource(R.drawable.table_zamok);
                imageView19.setImageResource(R.drawable.table_zamok);
                imageView20.setImageResource(R.drawable.table_zamok);
                imageView21.setImageResource(R.drawable.table_zamok);
                imageView22.setImageResource(R.drawable.table_zamok);
                imageView23.setImageResource(R.drawable.table_zamok);
                imageView24.setImageResource(R.drawable.table_zamok);
                imageView24_1.setImageResource(R.drawable.table_zamok);
                imageView24_2.setImageResource(R.drawable.table_zamok);
                imageView25.setImageResource(R.drawable.table_zamok);
                imageView26.setImageResource(R.drawable.table_zamok);
                imageView27.setImageResource(R.drawable.table_zamok);
                imageView28.setImageResource(R.drawable.table_zamok);
                imageView29.setImageResource(R.drawable.table_zamok);
                imageView30.setImageResource(R.drawable.table_zamok);
                imageView31.setImageResource(R.drawable.table_zamok);
                imageView32.setImageResource(R.drawable.table_zamok);
                imageView33.setImageResource(R.drawable.table_zamok);
                imageView34.setImageResource(R.drawable.table_zamok);
                imageView35.setImageResource(R.drawable.table_zamok);
                imageView36.setImageResource(R.drawable.table_zamok);
                imageView37.setImageResource(R.drawable.table_zamok);
                break;
            case 3:
                imageView1.setImageResource(R.drawable.table_glassnew);
                imageView2.setImageResource(R.drawable.tablemedprov);
                imageView3.setImageResource(R.drawable.iron_platenew);
                imageView4.setImageResource(R.drawable.tablelopast);
                imageView4_1.setImageResource(R.drawable.table_antenna);
                imageView5.setImageResource(R.drawable.pipe);
                imageView5_1.setImageResource(R.drawable.table_korpus);
                imageView6.setImageResource(R.drawable.table_bak);
                imageView7.setImageResource(R.drawable.table_screen);
                imageView8.setImageResource(R.drawable.table_chip);
                imageView9.setImageResource(R.drawable.table_vtplast);
                imageView10.setImageResource(R.drawable.wiring);
                imageView11.setImageResource(R.drawable.table_vint);
                imageView12.setImageResource(R.drawable.tozzle);
                imageView13.setImageResource(R.drawable.cpu);
                imageView14.setImageResource(R.drawable.tableakk);
                imageView15.setImageResource(R.drawable.turbine);
                imageView16.setImageResource(R.drawable.table_nasos);
                imageView17.setImageResource(R.drawable.solar_panel);
                imageView18.setImageResource(R.drawable.satellite_dishnew);
                imageView19.setImageResource(R.drawable.table_transp);
                imageView20.setImageResource(R.drawable.tableoptek);
                imageView21.setImageResource(R.drawable.sheathing);
                imageView22.setImageResource(R.drawable.table_zamok);
                imageView23.setImageResource(R.drawable.table_zamok);
                imageView24.setImageResource(R.drawable.table_zamok);
                imageView24_1.setImageResource(R.drawable.table_zamok);
                imageView24_2.setImageResource(R.drawable.table_zamok);
                imageView25.setImageResource(R.drawable.table_zamok);
                imageView26.setImageResource(R.drawable.table_zamok);
                imageView27.setImageResource(R.drawable.table_zamok);
                imageView28.setImageResource(R.drawable.table_zamok);
                imageView29.setImageResource(R.drawable.table_zamok);
                imageView30.setImageResource(R.drawable.table_zamok);
                imageView31.setImageResource(R.drawable.table_zamok);
                imageView32.setImageResource(R.drawable.table_zamok);
                imageView33.setImageResource(R.drawable.table_zamok);
                imageView34.setImageResource(R.drawable.table_zamok);
                imageView35.setImageResource(R.drawable.table_zamok);
                imageView36.setImageResource(R.drawable.table_zamok);
                imageView37.setImageResource(R.drawable.table_zamok);
                break;
            case 4:
                imageView1.setImageResource(R.drawable.table_glassnew);
                imageView2.setImageResource(R.drawable.tablemedprov);
                imageView3.setImageResource(R.drawable.iron_platenew);
                imageView4.setImageResource(R.drawable.tablelopast);
                imageView4_1.setImageResource(R.drawable.table_antenna);
                imageView5_1.setImageResource(R.drawable.table_korpus);
                imageView5.setImageResource(R.drawable.pipe);
                imageView6.setImageResource(R.drawable.table_bak);
                imageView7.setImageResource(R.drawable.table_screen);
                imageView8.setImageResource(R.drawable.table_chip);
                imageView9.setImageResource(R.drawable.table_vtplast);
                imageView10.setImageResource(R.drawable.wiring);
                imageView11.setImageResource(R.drawable.table_vint);
                imageView12.setImageResource(R.drawable.tozzle);
                imageView13.setImageResource(R.drawable.cpu);
                imageView14.setImageResource(R.drawable.tableakk);
                imageView15.setImageResource(R.drawable.turbine);
                imageView16.setImageResource(R.drawable.table_nasos);
                imageView17.setImageResource(R.drawable.solar_panel);
                imageView18.setImageResource(R.drawable.satellite_dishnew);
                imageView19.setImageResource(R.drawable.table_transp);
                imageView20.setImageResource(R.drawable.tableoptek);
                imageView21.setImageResource(R.drawable.sheathing);
                imageView22.setImageResource(R.drawable.tablekomp);
                imageView23.setImageResource(R.drawable.table_telefon);
                imageView24.setImageResource(R.drawable.satellite);
                imageView24_1.setImageResource(R.drawable.table_sist_zh);
                imageView24_2.setImageResource(R.drawable.tablezhilmod);
                imageView25.setImageResource(R.drawable.rocket_accelerator);
                imageView26.setImageResource(R.drawable.table_comp);
                imageView27.setImageResource(R.drawable.electric_motor);
                imageView28.setImageResource(R.drawable.tablemarsohod);
                imageView29.setImageResource(R.drawable.table_server);
                imageView30.setImageResource(R.drawable.table_fly_car);
                imageView31.setImageResource(R.drawable.table_zamok);
                imageView32.setImageResource(R.drawable.table_zamok);
                imageView33.setImageResource(R.drawable.table_zamok);
                imageView34.setImageResource(R.drawable.table_zamok);
                imageView35.setImageResource(R.drawable.table_zamok);
                imageView36.setImageResource(R.drawable.table_zamok);
                imageView37.setImageResource(R.drawable.table_zamok);
                break;
            case 5:
                imageView1.setImageResource(R.drawable.table_glassnew);
                imageView2.setImageResource(R.drawable.tablemedprov);
                imageView3.setImageResource(R.drawable.iron_platenew);
                imageView4.setImageResource(R.drawable.tablelopast);
                imageView4_1.setImageResource(R.drawable.table_antenna);
                imageView5_1.setImageResource(R.drawable.table_korpus);
                imageView5.setImageResource(R.drawable.table_truba);
                imageView6.setImageResource(R.drawable.table_bak);
                imageView7.setImageResource(R.drawable.table_screen);
                imageView8.setImageResource(R.drawable.table_chip);
                imageView9.setImageResource(R.drawable.table_vtplast);
                imageView10.setImageResource(R.drawable.wiring);
                imageView11.setImageResource(R.drawable.table_vint);
                imageView12.setImageResource(R.drawable.tozzle);
                imageView13.setImageResource(R.drawable.cpu);
                imageView14.setImageResource(R.drawable.tableakk);
                imageView15.setImageResource(R.drawable.turbine);
                imageView16.setImageResource(R.drawable.table_nasos);
                imageView17.setImageResource(R.drawable.solar_panel);
                imageView18.setImageResource(R.drawable.satellite_dishnew);
                imageView19.setImageResource(R.drawable.table_transp);
                imageView20.setImageResource(R.drawable.tableoptek);
                imageView21.setImageResource(R.drawable.sheathing);
                imageView22.setImageResource(R.drawable.tablekomp);
                imageView23.setImageResource(R.drawable.table_telefon);
                imageView24.setImageResource(R.drawable.satellite);
                imageView24_1.setImageResource(R.drawable.table_sist_zh);
                imageView24_2.setImageResource(R.drawable.tablezhilmod);
                imageView25.setImageResource(R.drawable.rocket_accelerator);
                imageView26.setImageResource(R.drawable.table_comp);
                imageView27.setImageResource(R.drawable.electric_motor);
                imageView28.setImageResource(R.drawable.tablemarsohod);
                imageView29.setImageResource(R.drawable.table_server);
                imageView30.setImageResource(R.drawable.table_fly_car);
                imageView31.setImageResource(R.drawable.table_3stup);
                imageView32.setImageResource(R.drawable.table_2stup);
                imageView33.setImageResource(R.drawable.table_1stup);
                imageView34.setImageResource(R.drawable.table_zamok);
                imageView35.setImageResource(R.drawable.table_rocket);
                imageView36.setImageResource(R.drawable.table_zamok);
                imageView37.setImageResource(R.drawable.table_zamok);
                break;
        }
        /*switch(stage){
            case 1:
                ImageView x1 = (ImageView) it.next();
                x1.setImageResource(R.drawable.glassnew);
                ImageView x2 = (ImageView) it.next();
                x2.setImageResource(R.drawable.tablemedprov);
                ImageView x3 = (ImageView) it.next();
                x3.setImageResource(R.drawable.iron_platenew);
                while(it.hasNext()){
                    ImageView d = (ImageView) it.next();
                    d.setImageResource(R.drawable.table_zamok);
                }
        }*/
    }
    protected void onResume() {
        super.onResume();
        overridePendingTransition(0, 0);
    }
        /*public void OnClickShelezo(View view) {
            Intent intent = new Intent(Inventory.this, IShelezo.class);
            startActivity(intent);
        }
        public void OnClickMed(View view) {
            Intent intent = new Intent(Inventory.this, IMed.class);
            startActivity(intent);
        }
        public void OnClickKwarz(View view) {
            Intent intent = new Intent(Inventory.this, IKwarz.class);
            startActivity(intent);
        }
        public void OnClickGraok(View view) {
            Intent intent = new Intent(Inventory.this, IGraok.class);
            startActivity(intent);
        }
        public void OnClickGrafen(View view) {
            Intent intent = new Intent(Inventory.this, IGrafen.class);
            startActivity(intent);
        }*/
        public void OnClickSteklo(View view) {
            Intent intent = new Intent(Inventory.this, ISteklo.class);
            startActivity(intent);
        }
        public void OnClickVtoip(View view) {
        Intent intent = new Intent(Inventory.this, IVtoip.class);
        startActivity(intent);
        }
        public void OnClickMedProvoda(View view) {
            Intent intent = new Intent(Inventory.this, IMedProvoda.class);
            startActivity(intent);
        }
        public void OnClickZhelezPlast(View view) {
            Intent intent = new Intent(Inventory.this, ZhelezPlast.class);
            startActivity(intent);
        }
        public void OnClickResina(View view) {
            if(stage>1){
            Intent intent = new Intent(Inventory.this, IResina.class);
            startActivity(intent);
            }
        }
        public void OnClickLopast(View view) {
            if (stage > 1) {
                Intent intent = new Intent(Inventory.this, ILopast.class);
                startActivity(intent);
            }
        }
        public void OnClickAntenna(View view) {
            if(stage > 1) {
                Intent intent = new Intent(Inventory.this, IAntenna.class);
                startActivity(intent);
            }
        }
        public void OnClickTruba(View view) {
            if(stage > 1) {
                Intent intent = new Intent(Inventory.this, ITruba.class);
                startActivity(intent);
            }
        }
        public void OnClickCorpus(View view) {
            if(stage > 1) {
                Intent intent = new Intent(Inventory.this, ICorpus.class);
                startActivity(intent);
            }
        }
        public void OnClickBaki(View view) {
            if(stage > 1) {
                Intent intent = new Intent(Inventory.this, IBaki.class);
                startActivity(intent);
            }
        }
        public void OnClickEkran(View view) {
            if(stage > 1) {
                Intent intent = new Intent(Inventory.this, IEkran.class);
                startActivity(intent);
            }
        }
        public void OnClickChip(View view) {
            if(stage > 1) {
                Intent intent = new Intent(Inventory.this, IChip.class);
                startActivity(intent);
            }
        }
        public void OnClickVtoipovayaPlast(View view) {
            if(stage > 1) {
                Intent intent = new Intent(Inventory.this, IVtoipovayaPlast.class);
                startActivity(intent);
            }
        }
        public void OnClickProvodka(View view) {
            if(stage > 1) {
                Intent intent = new Intent(Inventory.this, IProvodka.class);
                startActivity(intent);
            }
        }
        public void OnClickSoplo(View view) {
            if(stage > 1) {
                Intent intent = new Intent(Inventory.this, ISoplo.class);
                startActivity(intent);
            }
        }
        public void OnClickVint(View view) {
            if(stage > 2) {
                Intent intent = new Intent(Inventory.this, IVint.class);
                startActivity(intent);
            }
        }
        public void OnClickProcessor(View view) {
            if(stage > 2) {
                Intent intent = new Intent(Inventory.this, IProcessor.class);
                startActivity(intent);
            }
        }
        public void OnClickAccumulator(View view) {
            if(stage > 2) {
                Intent intent = new Intent(Inventory.this, IAccumulator.class);
                startActivity(intent);
            }
        }
        public void OnClickTurbina(View view) {
            if(stage > 2) {
                Intent intent = new Intent(Inventory.this, ITurbina.class);
                startActivity(intent);
            }
        }
        public void OnClickNasos(View view) {
            if(stage > 2) {
                Intent intent = new Intent(Inventory.this, INasos.class);
                startActivity(intent);
            }
        }
        public void OnClickSolnechnayaPanel(View view) {
            if(stage > 2) {
                Intent intent = new Intent(Inventory.this, ISolnechnayaPanel.class);
                startActivity(intent);
            }
        }
        public void OnClickSputnikovayaTarelka(View view) {
            if(stage > 2) {
                Intent intent = new Intent(Inventory.this, ISputnikovayaTarelka.class);
                startActivity(intent);
            }
        }
        public void OnClickTransponder(View view) {
            if(stage > 2) {
                Intent intent = new Intent(Inventory.this, ITransponder.class);
                startActivity(intent);
            }
        }
        public void OnClickObtekatel(View view) {
            if(stage > 2) {
                Intent intent = new Intent(Inventory.this, IObtekatel.class);
                startActivity(intent);
            }
        }
        public void OnClickObshivka(View view) {
            if(stage > 2) {
                Intent intent = new Intent(Inventory.this, IObshivka.class);
                startActivity(intent);
            }
        }
        public void OnClickComputer(View view) {
            if(stage > 3) {
                Intent intent = new Intent(Inventory.this, IComputer.class);
                startActivity(intent);
            }
        }
        public void OnClickTelephon(View view) {
            if(stage > 3) {
                Intent intent = new Intent(Inventory.this, ITelephon.class);
                startActivity(intent);
            }
        }
        public void OnClickSputnik(View view) {
            if(stage > 3) {
                Intent intent = new Intent(Inventory.this, ISputnik.class);
                startActivity(intent);
            }
        }
        public void OnClickSistemaShizneobespecheniya(View view) {
            if(stage > 3) {
                Intent intent = new Intent(Inventory.this, ISistemaShisneobespecheniya.class);
                startActivity(intent);
            }
        }
        public void OnClickShiloyModul(View view) {
            if(stage > 3) {
                Intent intent = new Intent(Inventory.this, IShiloyModul.class);
                startActivity(intent);
            }
        }
        public void OnClickRaketniyUskoritel(View view) {
            if(stage > 3) {
                Intent intent = new Intent(Inventory.this, IRaketniyUskoritel.class);
                startActivity(intent);
            }
        }
        public void OnClickBortovoyComputer(View view) {
            if(stage > 3) {
                Intent intent = new Intent(Inventory.this, IBortovoyComputer.class);
                startActivity(intent);
            }
        }
        public void OnClickElektrodvigatel(View view) {
            if(stage > 3) {
                Intent intent = new Intent(Inventory.this, IElektrodvigatel.class);
                startActivity(intent);
            }
        }
        public void OnClickMarsochod(View view) {
            if(stage > 3) {
                Intent intent = new Intent(Inventory.this, IMarsochod.class);
                startActivity(intent);
            }
        }
        public void OnClickServer(View view) {
            if(stage > 4) {
                Intent intent = new Intent(Inventory.this, IServer.class);
                startActivity(intent);
            }
        }
        public void OnClickLetaushayaMashina(View view) {
            if(stage > 4) {
                Intent intent = new Intent(Inventory.this, ILetaushayaMashina.class);
                startActivity(intent);
            }
        }
        public void OnClickTretyaStupen(View view) {
            if(stage > 4) {
                Intent intent = new Intent(Inventory.this, ITretyaStupen.class);
                startActivity(intent);
            }
        }
        public void OnClickVtorayaStupen(View view) {
            if(stage > 4) {
                Intent intent = new Intent(Inventory.this, IVtorayaStupen.class);
                startActivity(intent);
            }
        }
        public void OnClickPervayaStupen(View view) {
            if(stage > 4) {
                Intent intent = new Intent(Inventory.this, IPervayaStupen.class);
                startActivity(intent);
            }
        }
        public void OnClickModulStancii(View view) {
            if(stage > 4) {
                Intent intent = new Intent(Inventory.this, IModulStancii.class);
                startActivity(intent);
            }
        }
        public void OnClickRaketa(View view) {
            if(stage > 4) {
                Intent intent = new Intent(Inventory.this, IRaketa.class);
                startActivity(intent);
            }
        }
        public void OnClickMeshplanetnayaStanciya(View view) {
            if(stage > 4) {
                Intent intent = new Intent(Inventory.this, IMeshplanetnayaStanciya.class);
                startActivity(intent);
            }
        }
    }

