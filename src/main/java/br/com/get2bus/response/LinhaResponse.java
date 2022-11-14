package br.com.get2bus.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LinhaResponse {
    private Integer cl;
    private Boolean lc;
    private String lt;
    private Integer tl;
    private Integer sl;
    private String tp;
    private String ts;
}
