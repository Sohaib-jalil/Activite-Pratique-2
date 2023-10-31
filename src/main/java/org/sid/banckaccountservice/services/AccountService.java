package org.sid.banckaccountservice.services;

import org.sid.banckaccountservice.dto.BankAccountRequestDTO;
import org.sid.banckaccountservice.dto.BankAccountResponseDTO;

public interface AccountService {
    BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);
}
