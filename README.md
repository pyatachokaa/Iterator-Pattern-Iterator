# Iterator-Pattern-Iterator
Iterator pattern позволяет клиентскому коду перемещаться по элементам коллекции (в данном случае — песням в списке воспроизведения), не раскрывая базовую структуру коллекции. Он обеспечивает единый способ доступа к элементам независимо от конкретной реализации коллекции.

Iterator Interface (Iterator):
It defines the methods hasNext() and next() which are used to check if there are more elements in the iteration and to retrieve the next element respectively.
Playlist Interface (Playlist):
It declares the method createIterator() to create an iterator for iterating over the songs in the playlist.
It declares the method addSong(song: Song) to add a song to the playlist.
Song Class:
It represents a single song with properties like title and artist.
PlaylistImpl Class:
It implements the Playlist interface.
It maintains an internal list of Song objects.
It provides an implementation for the createIterator() method, returning an instance of the SongIterator class.
Sample Client Code (Main):
It demonstrates the usage of the Iterator pattern.
It creates a playlist, adds songs to it, and then iterates over the playlist using the iterator returned by createIterator().
