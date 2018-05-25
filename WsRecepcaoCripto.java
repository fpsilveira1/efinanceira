/**
 * WsRecepcaoCripto.java
 * 
 * This file was auto-generated from WSDL by the Apache Axis2 version: 1.6.4 Built on : Dec 28, 2015 (10:03:39
 * GMT)
 */ 

package br.com.pdcase.efinanceira.ws.client.recepcao;

import java.net.SocketTimeoutException;

/*
 * WsRecepcaoCripto java interface
 */

public interface WsRecepcaoCripto {

	/**
	 * Auto generated method signature Servico para recepcao de lote criptografado para a e-Financeira
	 * compactado GZip.
	 * 
	 * @param bufferXmlComLoteCriptografadoGZip
	 * @throws SocketTimeoutException 
	 */

	public br.com.pdcase.efinanceira.ws.client.recepcao.util.ReceberLoteEventoCriptoGZipResult receberLoteEventoCriptoGZip(

			br.com.pdcase.efinanceira.ws.client.recepcao.util.BufferXmlComLoteCriptografadoGZip bufferXmlComLoteCriptografadoGZip)
			throws java.rmi.RemoteException, SocketTimeoutException;

	/**
	 * Auto generated method signature Servico para recepcao de lote criptografado para a e-Financeira.
	 * 
	 * @param bufferXmlComLoteCriptografado
	 */

	public br.com.pdcase.efinanceira.ws.client.recepcao.util.ReceberLoteEventoCriptoResult receberLoteEventoCripto(

			br.com.pdcase.efinanceira.ws.client.recepcao.util.BufferXmlComLoteCriptografado bufferXmlComLoteCriptografado)
			throws java.rmi.RemoteException, SocketTimeoutException;

	//
}
