/**
 * WsRecepcaoCriptoStub.java
 * 
 * This file was auto-generated from WSDL by the Apache Axis2 version: 1.6.4 Built on : Dec 28, 2015 (10:03:39
 * GMT)
 */
package br.com.pdcase.efinanceira.ws.client.recepcao;

import java.net.SocketTimeoutException;

/*
 * WsRecepcaoCriptoStub java implementation
 */

public class WsRecepcaoCriptoStub extends org.apache.axis2.client.Stub implements WsRecepcaoCripto {
	protected org.apache.axis2.description.AxisOperation[] _operations;

	// hashmaps to keep the fault mapping
	private java.util.HashMap faultExceptionNameMap = new java.util.HashMap();
	private java.util.HashMap faultExceptionClassNameMap = new java.util.HashMap();
	private java.util.HashMap faultMessageMap = new java.util.HashMap();

	private static int counter = 0;

	private static synchronized java.lang.String getUniqueSuffix() {
		// reset the counter if it is greater than 99999
		if (counter > 99999) {
			counter = 0;
		}
		counter = counter + 1;
		return java.lang.Long.toString(java.lang.System.currentTimeMillis()) + "_" + counter;
	}

	private void populateAxisService() throws org.apache.axis2.AxisFault {

		// creating the Service with a unique name
		_service = new org.apache.axis2.description.AxisService("WsRecepcaoCripto" + getUniqueSuffix());
		addAnonymousOperations();

		// creating the operations
		org.apache.axis2.description.AxisOperation __operation;

		_operations = new org.apache.axis2.description.AxisOperation[2];

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://sped.fazenda.gov.br/",
				"receberLoteEventoCriptoGZip"));
		_service.addOperation(__operation);

		_operations[0] = __operation;

		__operation = new org.apache.axis2.description.OutInAxisOperation();

		__operation.setName(new javax.xml.namespace.QName("http://sped.fazenda.gov.br/",
				"receberLoteEventoCripto"));
		_service.addOperation(__operation);

		_operations[1] = __operation;

	}

	// populates the faults
	private void populateFaults() {

	}

	/**
	 * Constructor that takes in a configContext
	 */

	public WsRecepcaoCriptoStub(org.apache.axis2.context.ConfigurationContext configurationContext,
			java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
		this(configurationContext, targetEndpoint, false);
	}

	/**
	 * Constructor that takes in a configContext and useseperate listner
	 */
	public WsRecepcaoCriptoStub(org.apache.axis2.context.ConfigurationContext configurationContext,
			java.lang.String targetEndpoint, boolean useSeparateListener) throws org.apache.axis2.AxisFault {
		// To populate AxisService
		populateAxisService();
		populateFaults();

		_serviceClient = new org.apache.axis2.client.ServiceClient(configurationContext, _service);

		_serviceClient.getOptions().setTo(new org.apache.axis2.addressing.EndpointReference(targetEndpoint));
		_serviceClient.getOptions().setUseSeparateListener(useSeparateListener);

		// Set the soap version
		_serviceClient.getOptions().setSoapVersionURI(
				org.apache.axiom.soap.SOAP12Constants.SOAP_ENVELOPE_NAMESPACE_URI);

	}

	/**
	 * Default Constructor
	 */
	public WsRecepcaoCriptoStub(org.apache.axis2.context.ConfigurationContext configurationContext)
			throws org.apache.axis2.AxisFault {

		this(configurationContext,
				"http://efinanc.receita.fazenda.gov.br/WsEFinanceiraCripto/WsRecepcaoCripto.asmx");

	}

	/**
	 * Default Constructor
	 */
	public WsRecepcaoCriptoStub() throws org.apache.axis2.AxisFault {

		this("http://efinanc.receita.fazenda.gov.br/WsEFinanceiraCripto/WsRecepcaoCripto.asmx");

	}

	/**
	 * Constructor taking the target endpoint
	 */
	public WsRecepcaoCriptoStub(java.lang.String targetEndpoint) throws org.apache.axis2.AxisFault {
		this(null, targetEndpoint);
	}

	/**
	 * Auto generated method signature Servico para recepcao de lote criptografado para a e-Financeira
	 * compactado GZip.
	 * 
	 * @see br.com.pdcase.efinanceira.ws.client.recepcao.WsRecepcaoCripto#receberLoteEventoCriptoGZip
	 * @param bufferXmlComLoteCriptografadoGZip0
	 */

	public br.com.pdcase.efinanceira.ws.client.recepcao.util.ReceberLoteEventoCriptoGZipResult receberLoteEventoCriptoGZip(

			br.com.pdcase.efinanceira.ws.client.recepcao.util.BufferXmlComLoteCriptografadoGZip bufferXmlComLoteCriptografadoGZip0)

	throws java.rmi.RemoteException, SocketTimeoutException {
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[0].getName());
			_operationClient.getOptions().setAction("http://sped.fazenda.gov.br/ReceberLoteEventoCriptoGZip");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
					bufferXmlComLoteCriptografadoGZip0, optimizeContent(new javax.xml.namespace.QName(
							"http://sped.fazenda.gov.br/", "receberLoteEventoCriptoGZip")),
					new javax.xml.namespace.QName("http://sped.fazenda.gov.br/",
							"receberLoteEventoCriptoGZip"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			java.lang.Object object = fromOM(
					_returnEnv.getBody().getFirstElement(),
					br.com.pdcase.efinanceira.ws.client.recepcao.util.ReceberLoteEventoCriptoGZipResult.class,
					getEnvelopeNamespaces(_returnEnv));

			return (br.com.pdcase.efinanceira.ws.client.recepcao.util.ReceberLoteEventoCriptoGZipResult) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt
						.getQName(), "ReceberLoteEventoCriptoGZip"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
										"ReceberLoteEventoCriptoGZip"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor
								.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
										"ReceberLoteEventoCriptoGZip"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[]{messageClass});
						m.invoke(ex, new java.lang.Object[]{messageObject});

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * Auto generated method signature Servico para recepcao de lote criptografado para a e-Financeira.
	 * 
	 * @see br.com.pdcase.efinanceira.ws.client.recepcao.WsRecepcaoCripto#receberLoteEventoCripto
	 * @param bufferXmlComLoteCriptografado2
	 */

	public br.com.pdcase.efinanceira.ws.client.recepcao.util.ReceberLoteEventoCriptoResult receberLoteEventoCripto(

			br.com.pdcase.efinanceira.ws.client.recepcao.util.BufferXmlComLoteCriptografado bufferXmlComLoteCriptografado2)

	throws java.rmi.RemoteException, SocketTimeoutException

	{
		org.apache.axis2.context.MessageContext _messageContext = null;
		try {
			org.apache.axis2.client.OperationClient _operationClient = _serviceClient
					.createClient(_operations[1].getName());
			_operationClient.getOptions().setAction("http://sped.fazenda.gov.br/ReceberLoteEventoCripto");
			_operationClient.getOptions().setExceptionToBeThrownOnSOAPFault(true);

			addPropertyToOperationClient(_operationClient,
					org.apache.axis2.description.WSDL2Constants.ATTR_WHTTP_QUERY_PARAMETER_SEPARATOR, "&");

			// create a message context
			_messageContext = new org.apache.axis2.context.MessageContext();

			// create SOAP envelope with that payload
			org.apache.axiom.soap.SOAPEnvelope env = null;

			env = toEnvelope(getFactory(_operationClient.getOptions().getSoapVersionURI()),
					bufferXmlComLoteCriptografado2, optimizeContent(new javax.xml.namespace.QName(
							"http://sped.fazenda.gov.br/", "receberLoteEventoCripto")),
					new javax.xml.namespace.QName("http://sped.fazenda.gov.br/", "receberLoteEventoCripto"));

			// adding SOAP soap_headers
			_serviceClient.addHeadersToEnvelope(env);
			// set the message context with that soap envelope
			_messageContext.setEnvelope(env);

			// add the message contxt to the operation client
			_operationClient.addMessageContext(_messageContext);

			// execute the operation client
			_operationClient.execute(true);

			org.apache.axis2.context.MessageContext _returnMessageContext = _operationClient
					.getMessageContext(org.apache.axis2.wsdl.WSDLConstants.MESSAGE_LABEL_IN_VALUE);
			org.apache.axiom.soap.SOAPEnvelope _returnEnv = _returnMessageContext.getEnvelope();

			java.lang.Object object = fromOM(_returnEnv.getBody().getFirstElement(),
					br.com.pdcase.efinanceira.ws.client.recepcao.util.ReceberLoteEventoCriptoResult.class,
					getEnvelopeNamespaces(_returnEnv));

			return (br.com.pdcase.efinanceira.ws.client.recepcao.util.ReceberLoteEventoCriptoResult) object;

		} catch (org.apache.axis2.AxisFault f) {

			org.apache.axiom.om.OMElement faultElt = f.getDetail();
			if (faultElt != null) {
				if (faultExceptionNameMap.containsKey(new org.apache.axis2.client.FaultMapKey(faultElt
						.getQName(), "ReceberLoteEventoCripto"))) {
					// make the fault by reflection
					try {
						java.lang.String exceptionClassName = (java.lang.String) faultExceptionClassNameMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
										"ReceberLoteEventoCripto"));
						java.lang.Class exceptionClass = java.lang.Class.forName(exceptionClassName);
						java.lang.reflect.Constructor constructor = exceptionClass
								.getConstructor(java.lang.String.class);
						java.lang.Exception ex = (java.lang.Exception) constructor
								.newInstance(f.getMessage());
						// message class
						java.lang.String messageClassName = (java.lang.String) faultMessageMap
								.get(new org.apache.axis2.client.FaultMapKey(faultElt.getQName(),
										"ReceberLoteEventoCripto"));
						java.lang.Class messageClass = java.lang.Class.forName(messageClassName);
						java.lang.Object messageObject = fromOM(faultElt, messageClass, null);
						java.lang.reflect.Method m = exceptionClass.getMethod("setFaultMessage",
								new java.lang.Class[]{messageClass});
						m.invoke(ex, new java.lang.Object[]{messageObject});

						throw new java.rmi.RemoteException(ex.getMessage(), ex);
					} catch (java.lang.ClassCastException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.ClassNotFoundException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.NoSuchMethodException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.reflect.InvocationTargetException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.IllegalAccessException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					} catch (java.lang.InstantiationException e) {
						// we cannot intantiate the class - throw the original Axis fault
						throw f;
					}
				} else {
					throw f;
				}
			} else {
				throw f;
			}
		} finally {
			if (_messageContext.getTransportOut() != null) {
				_messageContext.getTransportOut().getSender().cleanup(_messageContext);
			}
		}
	}

	/**
	 * A utility method that copies the namepaces from the SOAPEnvelope
	 */
	private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env) {
		java.util.Map returnMap = new java.util.HashMap();
		java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
		while (namespaceIterator.hasNext()) {
			org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
			returnMap.put(ns.getPrefix(), ns.getNamespaceURI());
		}
		return returnMap;
	}

	private javax.xml.namespace.QName[] opNameArray = null;

	private boolean optimizeContent(javax.xml.namespace.QName opName) {

		if (opNameArray == null) {
			return false;
		}
		for (int i = 0; i < opNameArray.length; i++) {
			if (opName.equals(opNameArray[i])) {
				return true;
			}
		}
		return false;
	}

	// http://efinanc.receita.fazenda.gov.br/WsEFinanceiraCripto/WsRecepcaoCripto.asmx
	private org.apache.axiom.om.OMElement toOM(
			br.com.pdcase.efinanceira.ws.client.recepcao.util.BufferXmlComLoteCriptografadoGZip param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							br.com.pdcase.efinanceira.ws.client.recepcao.util.BufferXmlComLoteCriptografadoGZip.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			br.com.pdcase.efinanceira.ws.client.recepcao.util.ReceberLoteEventoCriptoGZipResult param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param
					.getOMElement(
							br.com.pdcase.efinanceira.ws.client.recepcao.util.ReceberLoteEventoCriptoGZipResult.MY_QNAME,
							org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			br.com.pdcase.efinanceira.ws.client.recepcao.util.BufferXmlComLoteCriptografado param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					br.com.pdcase.efinanceira.ws.client.recepcao.util.BufferXmlComLoteCriptografado.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.om.OMElement toOM(
			br.com.pdcase.efinanceira.ws.client.recepcao.util.ReceberLoteEventoCriptoResult param,
			boolean optimizeContent) throws org.apache.axis2.AxisFault {

		try {
			return param.getOMElement(
					br.com.pdcase.efinanceira.ws.client.recepcao.util.ReceberLoteEventoCriptoResult.MY_QNAME,
					org.apache.axiom.om.OMAbstractFactory.getOMFactory());
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			br.com.pdcase.efinanceira.ws.client.recepcao.util.BufferXmlComLoteCriptografadoGZip param,
			boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param.getOMElement(
									br.com.pdcase.efinanceira.ws.client.recepcao.util.BufferXmlComLoteCriptografadoGZip.MY_QNAME,
									factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory,
			br.com.pdcase.efinanceira.ws.client.recepcao.util.BufferXmlComLoteCriptografado param,
			boolean optimizeContent, javax.xml.namespace.QName methodQName) throws org.apache.axis2.AxisFault {

		try {

			org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
			emptyEnvelope
					.getBody()
					.addChild(
							param.getOMElement(
									br.com.pdcase.efinanceira.ws.client.recepcao.util.BufferXmlComLoteCriptografado.MY_QNAME,
									factory));
			return emptyEnvelope;
		} catch (org.apache.axis2.databinding.ADBException e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}

	}

	/* methods to provide back word compatibility */

	/**
	 * get the default envelope
	 */
	private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory) {
		return factory.getDefaultEnvelope();
	}

	private java.lang.Object fromOM(org.apache.axiom.om.OMElement param, java.lang.Class type,
			java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault {

		try {

			if (br.com.pdcase.efinanceira.ws.client.recepcao.util.BufferXmlComLoteCriptografado.class
					.equals(type)) {

				return br.com.pdcase.efinanceira.ws.client.recepcao.util.BufferXmlComLoteCriptografado.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (br.com.pdcase.efinanceira.ws.client.recepcao.util.BufferXmlComLoteCriptografadoGZip.class
					.equals(type)) {

				return br.com.pdcase.efinanceira.ws.client.recepcao.util.BufferXmlComLoteCriptografadoGZip.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (br.com.pdcase.efinanceira.ws.client.recepcao.util.ReceberLoteEventoCriptoGZipResult.class
					.equals(type)) {

				return br.com.pdcase.efinanceira.ws.client.recepcao.util.ReceberLoteEventoCriptoGZipResult.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

			if (br.com.pdcase.efinanceira.ws.client.recepcao.util.ReceberLoteEventoCriptoResult.class
					.equals(type)) {

				return br.com.pdcase.efinanceira.ws.client.recepcao.util.ReceberLoteEventoCriptoResult.Factory
						.parse(param.getXMLStreamReaderWithoutCaching());

			}

		} catch (java.lang.Exception e) {
			throw org.apache.axis2.AxisFault.makeFault(e);
		}
		return null;
	}

}
