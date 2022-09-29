package edu.eci.ieti.exception;


import edu.eci.ieti.dto.ServerErrorResponseDto;
import edu.eci.ieti.enums.ErrorCodeEnum;
import org.springframework.http.HttpStatus;
import javax.ws.rs.InternalServerErrorException;

public class InvalidCredentialsException extends InternalServerErrorException
{
    public InvalidCredentialsException() {
        super();
        new ServerErrorResponseDto("User not found", ErrorCodeEnum.USER_NOT_FOUND, HttpStatus.NOT_FOUND);
    }
}