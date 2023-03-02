import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { LeafletModule } from '@asymmetrik/ngx-leaflet';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { HomepageComponent } from './homepage/homepage.component';
import { InfobodyComponent } from './infobody/infobody.component';
import { FooterComponent } from './footer/footer.component';
import { CarrosuelComponent } from './carrosuel/carrosuel.component';
import { CalendaryComponent } from './calendary/calendary.component';
import { MapsComponent } from './maps/maps.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    HomepageComponent,
    InfobodyComponent,
    FooterComponent,
    CarrosuelComponent,
    CalendaryComponent,
    MapsComponent
  ],
  imports: [
    BrowserModule,
    LeafletModule,
    AppRoutingModule 
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
