/**
 * Copyright to the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */

package isbndb.api.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Book {
    private String isbn;
    private String isbn13;
    private String title;
    private ArrayList<String> authors = new ArrayList<String>();

    public List<String> getAuthors() {
        return Collections.unmodifiableList(authors);
    }

    void addAuthor(String author) {
        authors.add(author);
    }

    String getTitle() {
        return title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    String getIsbn13() {
        return isbn13;
    }

    void setIsbn13(String isbn13) {
        this.isbn13 = isbn13;
    }

    String getIsbn() {
        return isbn;
    }

    void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
