import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  currentPage = 0;
  images = [
    {title: "Beach",url: "https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/20100726_Kalamitsi_Beach_Ionian_Sea_Lefkada_island_Greece.jpg/1024px-20100726_Kalamitsi_Beach_Ionian_Sea_Lefkada_island_Greece.jpg"},
    {title: "Mount Kilimanjaro",url: "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6b/Mt._Kilimanjaro_12.2006.JPG/800px-Mt._Kilimanjaro_12.2006.JPG"},
    {title: "Mount Everest",url: "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d1/Mount_Everest_as_seen_from_Drukair2_PLW_edit.jpg/1280px-Mount_Everest_as_seen_from_Drukair2_PLW_edit.jpg"},
    {title: "Victoria falls",url: "https://upload.wikimedia.org/wikipedia/commons/thumb/2/23/Cataratas_Victoria%2C_Zambia-Zimbabue%2C_2018-07-27%2C_DD_06.jpg/1280px-Cataratas_Victoria%2C_Zambia-Zimbabue%2C_2018-07-27%2C_DD_06.jpg"},
    {title: "Beach",url: "https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/20100726_Kalamitsi_Beach_Ionian_Sea_Lefkada_island_Greece.jpg/1024px-20100726_Kalamitsi_Beach_Ionian_Sea_Lefkada_island_Greece.jpg"},
    {title: "Mount Kilimanjaro",url: "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6b/Mt._Kilimanjaro_12.2006.JPG/800px-Mt._Kilimanjaro_12.2006.JPG"},
    {title: "Mount Everest",url: "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d1/Mount_Everest_as_seen_from_Drukair2_PLW_edit.jpg/1280px-Mount_Everest_as_seen_from_Drukair2_PLW_edit.jpg"},
    {title: "Victoria falls",url: "https://upload.wikimedia.org/wikipedia/commons/thumb/2/23/Cataratas_Victoria%2C_Zambia-Zimbabue%2C_2018-07-27%2C_DD_06.jpg/1280px-Cataratas_Victoria%2C_Zambia-Zimbabue%2C_2018-07-27%2C_DD_06.jpg"},
    {title: "Beach",url: "https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/20100726_Kalamitsi_Beach_Ionian_Sea_Lefkada_island_Greece.jpg/1024px-20100726_Kalamitsi_Beach_Ionian_Sea_Lefkada_island_Greece.jpg"},
    {title: "Mount Kilimanjaro",url: "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6b/Mt._Kilimanjaro_12.2006.JPG/800px-Mt._Kilimanjaro_12.2006.JPG"},
    {title: "Mount Everest",url: "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d1/Mount_Everest_as_seen_from_Drukair2_PLW_edit.jpg/1280px-Mount_Everest_as_seen_from_Drukair2_PLW_edit.jpg"},
    {title: "Victoria falls",url: "https://upload.wikimedia.org/wikipedia/commons/thumb/2/23/Cataratas_Victoria%2C_Zambia-Zimbabue%2C_2018-07-27%2C_DD_06.jpg/1280px-Cataratas_Victoria%2C_Zambia-Zimbabue%2C_2018-07-27%2C_DD_06.jpg"},
    {title: "Beach",url: "https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/20100726_Kalamitsi_Beach_Ionian_Sea_Lefkada_island_Greece.jpg/1024px-20100726_Kalamitsi_Beach_Ionian_Sea_Lefkada_island_Greece.jpg"},
    {title: "Mount Kilimanjaro",url: "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6b/Mt._Kilimanjaro_12.2006.JPG/800px-Mt._Kilimanjaro_12.2006.JPG"},
    {title: "Mount Everest",url: "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d1/Mount_Everest_as_seen_from_Drukair2_PLW_edit.jpg/1280px-Mount_Everest_as_seen_from_Drukair2_PLW_edit.jpg"},
    {title: "Victoria falls",url: "https://upload.wikimedia.org/wikipedia/commons/thumb/2/23/Cataratas_Victoria%2C_Zambia-Zimbabue%2C_2018-07-27%2C_DD_06.jpg/1280px-Cataratas_Victoria%2C_Zambia-Zimbabue%2C_2018-07-27%2C_DD_06.jpg"},
    {title: "Beach",url: "https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/20100726_Kalamitsi_Beach_Ionian_Sea_Lefkada_island_Greece.jpg/1024px-20100726_Kalamitsi_Beach_Ionian_Sea_Lefkada_island_Greece.jpg"},
    {title: "Mount Kilimanjaro",url: "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6b/Mt._Kilimanjaro_12.2006.JPG/800px-Mt._Kilimanjaro_12.2006.JPG"},
    {title: "Mount Everest",url: "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d1/Mount_Everest_as_seen_from_Drukair2_PLW_edit.jpg/1280px-Mount_Everest_as_seen_from_Drukair2_PLW_edit.jpg"},
    {title: "Victoria falls",url: "https://upload.wikimedia.org/wikipedia/commons/thumb/2/23/Cataratas_Victoria%2C_Zambia-Zimbabue%2C_2018-07-27%2C_DD_06.jpg/1280px-Cataratas_Victoria%2C_Zambia-Zimbabue%2C_2018-07-27%2C_DD_06.jpg"}
  ]
}
