package AzInvoiceProcess;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
// --- <<IS-END-IMPORTS>> ---

public final class javaservice

{
	// ---( internal utility methods )---

	final static javaservice _instance = new javaservice();

	static javaservice _newInstance() { return new javaservice(); }

	static javaservice _cast(Object o) { return (javaservice)o; }

	// ---( server methods )---




	public static final void throwException (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(throwException)>> ---
		// @sigtype java 3.5
		// [i] field:0:required excepMessage
		
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
			String	excepMessage = IDataUtil.getString( pipelineCursor, "excepMessage" );
		pipelineCursor.destroy();
		
		// pipeline
		try {
			throw new ServiceException(excepMessage);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		// --- <<IS-END>> ---

                
	}
}

