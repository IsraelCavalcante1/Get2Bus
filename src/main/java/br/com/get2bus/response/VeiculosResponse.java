package br.com.get2bus.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonProperty(value ="p")
private Integer vehiclePrefix;
private Boolean a;
private String ta;
private Double py;
private Double px;@AllArgsConstructor
public class VeiculosResponse {

}
