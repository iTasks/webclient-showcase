package gr.kmandalas.service.appointment.entity;

import gr.kmandalas.service.appointment.enumeration.OTPStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.ZonedDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("otp")
public class OTP {

  @Id
  @Column("id")
  private Long id;

  @Column("customer_id")
  private Long customerId;

  @Column("pin")
  private Integer pin;

  @Column("created_on")
  private ZonedDateTime createdOn;

  @Column("status")
  private OTPStatus status;

}
