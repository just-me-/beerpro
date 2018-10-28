package ch.beerpro.data.repositories;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Note implements Serializable {

    private String note;
    private String beerId;
}
